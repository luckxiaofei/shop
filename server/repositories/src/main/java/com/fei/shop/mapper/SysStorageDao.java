package com.fei.shop.mapper;

import com.fei.shop.entities.po.SysStorage;
import tk.mybatis.mapper.common.Mapper;

public interface SysStorageDao extends Mapper<SysStorage> {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStorage record);

    int insertSelective(SysStorage record);

    SysStorage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysStorage record);

    int updateByPrimaryKey(SysStorage record);
}
