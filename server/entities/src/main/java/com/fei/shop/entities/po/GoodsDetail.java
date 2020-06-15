package com.fei.shop.entities.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods_detail")
public class GoodsDetail {
    @Id
    private Integer id;

    /**
     * 商品编号
     */
    @Column(name = "goods_sn")
    private String goodsSn;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品所属类目ID
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 商品所属品牌ID
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 商品关键字，采用逗号间隔
     */
    private String keywords;

    /**
     * 商品简介
     */
    private String brief;

    /**
     * 商品宣传图片列表，采用JSON数组格式
     */
    private String gallery;

    /**
     * 商品页面商品图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 商品分享朋友圈图片
     */
    @Column(name = "share_url")
    private String shareUrl;

    /**
     * 是否上架
     */
    @Column(name = "is_on_sale")
    private Boolean isOnSale;

    /**
     * 是否新品首发，
     */
    @Column(name = "is_new")
    private Boolean isNew;

    /**
     * 是否人气推荐
     */
    @Column(name = "is_hot")
    private Boolean isHot;

    /**
     * 指导销售价格
     */
    @Column(name = "counter_price")
    private BigDecimal counterPrice;

    /**
     * 实际销售价格
     */
    @Column(name = "retail_price")
    private BigDecimal retailPrice;

    /**
     * 商品单位，例如件、盒
     */
    private String unit;

    /**
     * 排序
     */
    @Column(name = "sort_order")
    private Short sortOrder;

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
     * 商品详细介绍，是富文本格式
     */
    private String detail;

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
     * 获取商品编号
     *
     * @return goods_sn - 商品编号
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * 设置商品编号
     *
     * @param goodsSn 商品编号
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商品所属类目ID
     *
     * @return category_id - 商品所属类目ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置商品所属类目ID
     *
     * @param categoryId 商品所属类目ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取商品所属品牌ID
     *
     * @return brand_id - 商品所属品牌ID
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置商品所属品牌ID
     *
     * @param brandId 商品所属品牌ID
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取商品关键字，采用逗号间隔
     *
     * @return keywords - 商品关键字，采用逗号间隔
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置商品关键字，采用逗号间隔
     *
     * @param keywords 商品关键字，采用逗号间隔
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取商品简介
     *
     * @return brief - 商品简介
     */
    public String getBrief() {
        return brief;
    }

    /**
     * 设置商品简介
     *
     * @param brief 商品简介
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * 获取商品宣传图片列表，采用JSON数组格式
     *
     * @return gallery - 商品宣传图片列表，采用JSON数组格式
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * 设置商品宣传图片列表，采用JSON数组格式
     *
     * @param gallery 商品宣传图片列表，采用JSON数组格式
     */
    public void setGallery(String gallery) {
        this.gallery = gallery == null ? null : gallery.trim();
    }

    /**
     * 获取商品页面商品图片
     *
     * @return pic_url - 商品页面商品图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置商品页面商品图片
     *
     * @param picUrl 商品页面商品图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 获取商品分享朋友圈图片
     *
     * @return share_url - 商品分享朋友圈图片
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * 设置商品分享朋友圈图片
     *
     * @param shareUrl 商品分享朋友圈图片
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
    }

    /**
     * 获取是否上架
     *
     * @return is_on_sale - 是否上架
     */
    public Boolean getIsOnSale() {
        return isOnSale;
    }

    /**
     * 设置是否上架
     *
     * @param isOnSale 是否上架
     */
    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    /**
     * 获取是否新品首发，
     *
     * @return is_new - 是否新品首发，
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * 设置是否新品首发，
     *
     * @param isNew 是否新品首发，
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * 获取是否人气推荐
     *
     * @return is_hot - 是否人气推荐
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * 设置是否人气推荐
     *
     * @param isHot 是否人气推荐
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取指导销售价格
     *
     * @return counter_price - 指导销售价格
     */
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    /**
     * 设置指导销售价格
     *
     * @param counterPrice 指导销售价格
     */
    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    /**
     * 获取实际销售价格
     *
     * @return retail_price - 实际销售价格
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * 设置实际销售价格
     *
     * @param retailPrice 实际销售价格
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取商品单位，例如件、盒
     *
     * @return unit - 商品单位，例如件、盒
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置商品单位，例如件、盒
     *
     * @param unit 商品单位，例如件、盒
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取排序
     *
     * @return sort_order - 排序
     */
    public Short getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置排序
     *
     * @param sortOrder 排序
     */
    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
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

    /**
     * 获取商品详细介绍，是富文本格式
     *
     * @return detail - 商品详细介绍，是富文本格式
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品详细介绍，是富文本格式
     *
     * @param detail 商品详细介绍，是富文本格式
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}