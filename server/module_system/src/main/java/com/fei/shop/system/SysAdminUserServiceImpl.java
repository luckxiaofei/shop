package com.fei.shop.system;

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
        ArrayList<SysAdmin> result = Lists.newArrayList();
        List<SysAdmin> sysAdminList = sysAdminMapper.selectAll();
        if (sysAdminList == null || sysAdminList.size() > 1) {
            return result;
        }

        for (SysAdmin SysAdmin : sysAdminList) {
            Integer adminId = SysAdmin.getId();
            Example exampleSysAdminRole = new Example(SysAdminRole.class);
            exampleSysAdminRole.createCriteria().andEqualTo("userId", adminId);
            List<SysAdminRole> sysAdminRoles = sysAdminRoleMapper.selectByExample(exampleSysAdminRole);
            List<Integer> roleIdList = sysAdminRoles.stream().map(SysAdminRole::getRoleId).collect(Collectors.toList());
        }
        return result;
    }

}
