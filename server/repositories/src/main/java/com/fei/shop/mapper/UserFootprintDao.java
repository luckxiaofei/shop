package com.fei.shop.mapper;

import com.fei.shop.entities.po.UserFootprint;

public interface UserFootprintDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFootprint record);

    int insertSelective(UserFootprint record);

    UserFootprint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFootprint record);

    int updateByPrimaryKey(UserFootprint record);
}
