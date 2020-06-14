package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsIssue;

public interface GoodsIssueDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsIssue record);

    int insertSelective(GoodsIssue record);

    GoodsIssue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsIssue record);

    int updateByPrimaryKey(GoodsIssue record);
}
