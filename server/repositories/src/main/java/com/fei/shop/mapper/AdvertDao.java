package com.fei.shop.mapper;

import com.fei.shop.entities.po.Advert;

public interface AdvertDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Advert record);

    int insertSelective(Advert record);

    Advert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advert record);

    int updateByPrimaryKey(Advert record);
}
