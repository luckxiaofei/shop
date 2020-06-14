package com.fei.shop.system;

import com.alibaba.fastjson.JSON;
import com.fei.entities.po.SysAdmin;
import com.fei.entities.po.SysAdminRole;
import com.fei.service.SysAdminUserService;
import com.fei.shop.mapper.SysAdminMapper;
import com.fei.shop.mapper.SysAdminRoleMapper;
import com.fei.shop.mapper.SysRoleMapper;
import com.google.common.collect.Lists;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysAdminUserServiceImpl implements SysAdminUserService {
    @Autowired
    private SysAdminMapper sysAdminMapper;
    @Autowired
    private SysAdminRoleMapper sysAdminRoleMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysAdmin> getSysAdminVO() {
        List<SysAdmin> sysAdminList = sysAdminMapper.listSysAdminVOByName("1");
        System.err.println(JSON.toJSON(sysAdminList));
        return sysAdminList;
    }

    @Override
    public List<SysAdmin> getSysAdminVO(String name) {
        List<SysAdmin> sysAdminList = sysAdminMapper.listSysAdminVOByName("1");
        System.err.println(JSON.toJSON(sysAdminList));
        return null;
    }
}
