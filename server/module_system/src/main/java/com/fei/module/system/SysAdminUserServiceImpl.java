package com.fei.module.system;

import com.fei.db.mapper.SysAdminMapper;
import com.fei.db.mapper.SysAdminRoleMapper;
import com.fei.db.mapper.SysRoleMapper;
import com.fei.entities.po.SysAdminRole;
import com.fei.entities.vo.SysAdminVO;
import com.fei.service.SysAdminUserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;
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


    public List<SysAdminVO> getSysAdminVO(String userName) {
        ArrayList<SysAdminVO> result = Lists.newArrayList();
        List<SysAdminVO> sysAdminList = sysAdminMapper.listSysAdminVOByName(userName);
        if (sysAdminList == null || sysAdminList.size() > 1) {
            return result;
        }

        for (SysAdminVO sysAdminVO : sysAdminList) {
            Integer adminId = sysAdminVO.getId();
            Example exampleSysAdminRole = new Example(SysAdminRole.class);
            exampleSysAdminRole.createCriteria().andEqualTo("userId", adminId);
            List<SysAdminRole> sysAdminRoles = sysAdminRoleMapper.selectByExample(exampleSysAdminRole);
            List<Integer> roleIdList = sysAdminRoles.stream().map(SysAdminRole::getRoleId).collect(Collectors.toList());
            sysAdminVO.setSysRoleIdList(roleIdList);


        }
        return result;
    }

}
