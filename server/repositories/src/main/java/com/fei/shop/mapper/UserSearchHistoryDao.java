package com.fei.shop.mapper;

import com.fei.shop.entities.po.UserSearchHistory;

public interface UserSearchHistoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSearchHistory record);

    int insertSelective(UserSearchHistory record);

    UserSearchHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSearchHistory record);

    int updateByPrimaryKey(UserSearchHistory record);
}
