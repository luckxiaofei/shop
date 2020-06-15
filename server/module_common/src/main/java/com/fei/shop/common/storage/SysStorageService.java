package com.fei.common.storage;

import com.fei.shop.entities.po.SysStorage;
import com.fei.shop.mapper.SysStorageDao;
import com.github.pagehelper.PageHelper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class SysStorageService {
    @Autowired
    private SysStorageDao sysStorageDao;

    public void deleteByKey(String key) {
        Example example = new Example(SysStorage.class);
        example.createCriteria().andEqualTo("key", key);
        sysStorageDao.deleteByExample(example);
    }

    public void add(SysStorage storageInfo) {
        storageInfo.setAddTime(new Date());
        storageInfo.setUpdateTime(new Date());
        sysStorageDao.insertSelective(storageInfo);
    }

    public SysStorage findByKey(String key) {
        Example example = new Example(SysStorage.class);
        example.createCriteria().andEqualTo("key", key).andEqualTo("deleted", false);
        return sysStorageDao.selectOneByExample(example);
    }

    public int update(SysStorage storageInfo) {
        storageInfo.setUpdateTime(new Date());
        return sysStorageDao.updateByPrimaryKeySelective(storageInfo);
    }

    public SysStorage findById(Integer id) {
        return sysStorageDao.selectByPrimaryKey(id);
    }

    public List<SysStorage> querySelective(String key, String name, Integer page, Integer limit, String sort, String order) {
        Example example = new Example(SysStorage.class);
        Example.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(key)) {
            criteria.andEqualTo("key", key);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andLike("name", "%" + name + "%");
        }
        criteria.andEqualTo("deleted", false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return sysStorageDao.selectByExample(example);
    }
}
