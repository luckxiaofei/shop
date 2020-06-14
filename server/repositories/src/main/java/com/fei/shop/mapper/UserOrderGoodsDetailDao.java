package com.fei.shop.mapper;

import com.fei.shop.entities.po.UserOrderGoodsDetail;

public interface UserOrderGoodsDetailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOrderGoodsDetail record);

    int insertSelective(UserOrderGoodsDetail record);

    UserOrderGoodsDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOrderGoodsDetail record);

    int updateByPrimaryKey(UserOrderGoodsDetail record);
}
