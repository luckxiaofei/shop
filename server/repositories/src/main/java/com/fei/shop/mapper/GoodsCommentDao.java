package com.fei.shop.mapper;

import com.fei.shop.entities.po.GoodsComment;

public interface GoodsCommentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsComment record);

    int insertSelective(GoodsComment record);

    GoodsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsComment record);

    int updateByPrimaryKey(GoodsComment record);
}
