package com.fei.shop.mapper;

import com.fei.shop.entities.po.AdminRolePermission;

public interface AdminRolePermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminRolePermission record);

    int insertSelective(AdminRolePermission record);

    AdminRolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminRolePermission record);

    int updateByPrimaryKey(AdminRolePermission record);
}
