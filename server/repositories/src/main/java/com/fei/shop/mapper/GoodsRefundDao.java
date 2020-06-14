package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsRefund;

public interface GoodsRefundDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsRefund record);

    int insertSelective(GoodsRefund record);

    GoodsRefund selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsRefund record);

    int updateByPrimaryKey(GoodsRefund record);
}
