package com.plugin.collect.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 公司表
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
@TableName("company")
public class CompanyModel extends Model<CompanyModel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 域名
     */
    private String domain;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 申请人电话
     */
    private String contactPhone;

    /**
     * 地址
     */
    private String address;

    /**
     * 公司logo
     */
    private String logo;

    /**
     * 创建者
     */
    private Long creator;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新者
     */
    private Long updator;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 状态
     */
    private Integer state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdator() {
        return updator;
    }

    public void setUpdator(Long updator) {
        this.updator = updator;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
        "id=" + id +
        ", name=" + name +
        ", domain=" + domain +
        ", type=" + type +
        ", contactPhone=" + contactPhone +
        ", address=" + address +
        ", logo=" + logo +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updator=" + updator +
        ", updateTime=" + updateTime +
        ", state=" + state +
        "}";
    }
}
