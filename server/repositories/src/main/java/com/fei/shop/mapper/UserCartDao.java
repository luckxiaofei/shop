package com.fei.shop.mapper;

import com.fei.shop.entities.po.UserCart;

public interface UserCartDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCart record);

    int insertSelective(UserCart record);

    UserCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCart record);

    int updateByPrimaryKey(UserCart record);
}
