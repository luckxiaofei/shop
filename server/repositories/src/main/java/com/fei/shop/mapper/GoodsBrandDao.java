package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsBrand;

public interface GoodsBrandDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}
