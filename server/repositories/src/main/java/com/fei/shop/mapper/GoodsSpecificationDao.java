package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsSpecification;

public interface GoodsSpecificationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpecification record);

    int insertSelective(GoodsSpecification record);

    GoodsSpecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsSpecification record);

    int updateByPrimaryKey(GoodsSpecification record);
}
