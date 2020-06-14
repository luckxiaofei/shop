package com.fei.shop.mapper;

import com.fei.shop.entities.po.AdminNoticeReadingRecords;

public interface AdminNoticeReadingRecordsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminNoticeReadingRecords record);

    int insertSelective(AdminNoticeReadingRecords record);

    AdminNoticeReadingRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminNoticeReadingRecords record);

    int updateByPrimaryKey(AdminNoticeReadingRecords record);
}
