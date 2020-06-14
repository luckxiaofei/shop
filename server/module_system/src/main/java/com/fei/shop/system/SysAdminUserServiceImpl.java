package com.fei.shop.system;

import com.fei.service.SysAdminUserService;
import com.fei.shop.entities.po.AdminUser;
import com.google.common.collect.Lists;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class SysAdminUserServiceImpl implements SysAdminUserService {

    @Override
    public List<AdminUser> getSysAdminVO() {
        return Lists.newArrayList();
    }

    @Override
    public List<AdminUser> getSysAdminVO(String name) {
        return null;
    }
}
