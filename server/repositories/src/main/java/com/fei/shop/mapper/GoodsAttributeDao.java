package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsAttribute;

public interface GoodsAttributeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsAttribute record);

    int insertSelective(GoodsAttribute record);

    GoodsAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsAttribute record);

    int updateByPrimaryKey(GoodsAttribute record);
}
