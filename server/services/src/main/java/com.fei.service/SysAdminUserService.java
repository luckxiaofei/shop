package com.fei.service;

import com.fei.shop.entities.po.AdminUser;

import java.util.List;

public interface SysAdminUserService {
    List<AdminUser> getSysAdminVO();
    List<AdminUser> getSysAdminVO(String name);
}
