package com.fei.entities.vo;

import com.fei.shop.entities.po.AdminUser;
import lombok.Data;

import java.util.List;

@Data
public class SysAdminVO extends AdminUser {

    private List<AdminUser> sysRoleList;
    private List<Integer> sysRoleIdList;


}
