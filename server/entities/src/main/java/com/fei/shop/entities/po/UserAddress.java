package com.fei.shop.entities.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_address")
public class UserAddress {
    @Id
    private Integer id;

    /**
     * 收货人名称
     */
    private String name;

    /**
     * 用户表的用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 行政区域表的省ID
     */
    private String province;

    /**
     * 行政区域表的市ID
     */
    private String city;

    /**
     * 行政区域表的区县ID
     */
    private String county;

    /**
     * 详细收货地址
     */
    @Column(name = "address_detail")
    private String addressDetail;

    /**
     * 地区编码
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 邮政编码
     */
    @Column(name = "postal_code")
    private String postalCode;

    /**
     * 手机号码
     */
    private String tel;

    /**
     * 是否默认地址
     */
    @Column(name = "is_default")
    private Boolean isDefault;

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
     * 获取收货人名称
     *
     * @return name - 收货人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置收货人名称
     *
     * @param name 收货人名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取用户表的用户ID
     *
     * @return user_id - 用户表的用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户表的用户ID
     *
     * @param userId 用户表的用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取行政区域表的省ID
     *
     * @return province - 行政区域表的省ID
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置行政区域表的省ID
     *
     * @param province 行政区域表的省ID
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取行政区域表的市ID
     *
     * @return city - 行政区域表的市ID
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置行政区域表的市ID
     *
     * @param city 行政区域表的市ID
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取行政区域表的区县ID
     *
     * @return county - 行政区域表的区县ID
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置行政区域表的区县ID
     *
     * @param county 行政区域表的区县ID
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * 获取详细收货地址
     *
     * @return address_detail - 详细收货地址
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 设置详细收货地址
     *
     * @param addressDetail 详细收货地址
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * 获取地区编码
     *
     * @return area_code - 地区编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置地区编码
     *
     * @param areaCode 地区编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * 获取邮政编码
     *
     * @return postal_code - 邮政编码
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置邮政编码
     *
     * @param postalCode 邮政编码
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * 获取手机号码
     *
     * @return tel - 手机号码
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置手机号码
     *
     * @param tel 手机号码
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取是否默认地址
     *
     * @return is_default - 是否默认地址
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认地址
     *
     * @param isDefault 是否默认地址
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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