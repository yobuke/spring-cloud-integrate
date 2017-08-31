package com.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.demo.util.UUIDGenerator;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 系统名称: crm-model
 * 系统版本：V5.0.1
 * 模块名称: 问卷管理
 * 类  名  称: BaseObject.java
 * 功能说明： 基础类 抽取了每个实体类的公用属性
 * 开发人员: yuzhili
 * 开发时间: 2017年8月10日
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class BaseObject implements Serializable {

    /**
     * 序列号id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 主键----------------
     */
    private String id;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改人
     */
    private String modifier;
    /**
     * 最后修改时间
     */
    private Date modifiedTime;
    /**
     * 软删除标识
     */
    private boolean delFlag;

    /**
     * 租户信息
     */
    //private Tenant tenant;
    public BaseObject() {
        init();
    }

    private void init() {
        this.id = UUIDGenerator.getUUID();
        this.createTime = new Date();
        this.modifiedTime = new Date();
    }

    public BaseObject(String creator) {
        init();
        this.creator = creator;
        this.modifier = creator;
    }

    public BaseObject(String creator, String modifier) {
        init();
        this.creator = creator;
        this.modifier = modifier;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    /*public Tenant getTenant() {
        return tenant;
    }*/

    /*public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof BaseObject) {
            BaseObject that = (BaseObject) o;
            return Objects.equals(id, that.id);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("creator", creator)
                .append("createTime", createTime)
                .append("modifier", modifier)
                .append("modifiedTime", modifiedTime)
                .append("delFlag", delFlag)
                .toString();
    }
}

