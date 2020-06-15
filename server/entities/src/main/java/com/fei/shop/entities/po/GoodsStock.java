package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_stock")
public class GoodsStock {
    @Id
    private Integer id;

    /**
     * 商品表的商品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品规格
     */
    private String specification;

    /**
     * 商品规格Id
     */
    @Column(name = "specification_id")
    private Integer specificationId;

    /**
     * 商品货品数量
     */
    private Integer number;

    /**
     * 商品货品图片
     */
    private String url;

    /**
     * 创建时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 逻辑删除
     */
    private Boolean deleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品表的商品ID
     *
     * @return goods_id - 商品表的商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品表的商品ID
     *
     * @param goodsId 商品表的商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品规格
     *
     * @return specification - 商品规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 设置商品规格
     *
     * @param specification 商品规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * 获取商品规格Id
     *
     * @return specification_id - 商品规格Id
     */
    public Integer getSpecificationId() {
        return specificationId;
    }

    /**
     * 设置商品规格Id
     *
     * @param specificationId 商品规格Id
     */
    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

    /**
     * 获取商品货品数量
     *
     * @return number - 商品货品数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置商品货品数量
     *
     * @param number 商品货品数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取商品货品图片
     *
     * @return url - 商品货品图片
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置商品货品图片
     *
     * @param url 商品货品图片
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取创建时间
     *
     * @return add_time - 创建时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建时间
     *
     * @param addTime 创建时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取逻辑删除
     *
     * @return deleted - 逻辑删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param deleted 逻辑删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}