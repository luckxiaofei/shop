package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsCoupon;

public interface GoodsCouponDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsCoupon record);

    int insertSelective(GoodsCoupon record);

    GoodsCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsCoupon record);

    int updateByPrimaryKey(GoodsCoupon record);
}
