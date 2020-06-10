package com.fei.entities.vo;

import com.fei.entities.po.SysAdmin;
import com.fei.entities.po.SysRole;
import lombok.Data;

import java.util.List;

@Data
public class SysAdminVO extends SysAdmin {

    private List<SysRole> sysRoleList;
    private List<Integer> sysRoleIdList;


}
