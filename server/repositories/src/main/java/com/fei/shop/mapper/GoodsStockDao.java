package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsStock;

public interface GoodsStockDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsStock record);

    int insertSelective(GoodsStock record);

    GoodsStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsStock record);

    int updateByPrimaryKey(GoodsStock record);
}
