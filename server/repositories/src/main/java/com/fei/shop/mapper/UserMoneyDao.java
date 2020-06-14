package com.fei.shop.mapper;

import com.fei.shop.entities.po.UserMoney;

public interface UserMoneyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMoney record);

    int insertSelective(UserMoney record);

    UserMoney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMoney record);

    int updateByPrimaryKey(UserMoney record);
}
