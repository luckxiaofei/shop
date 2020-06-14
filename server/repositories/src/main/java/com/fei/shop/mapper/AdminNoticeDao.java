package com.fei.shop.mapper;

import com.fei.shop.entities.po.AdminNotice;

public interface AdminNoticeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminNotice record);

    int insertSelective(AdminNotice record);

    AdminNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminNotice record);

    int updateByPrimaryKey(AdminNotice record);
}
