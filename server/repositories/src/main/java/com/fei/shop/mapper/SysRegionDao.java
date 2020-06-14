package com.fei.shop.mapper;

import com.fei.shop.entities.po.SysRegion;

public interface SysRegionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRegion record);

    int insertSelective(SysRegion record);

    SysRegion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRegion record);

    int updateByPrimaryKey(SysRegion record);
}
