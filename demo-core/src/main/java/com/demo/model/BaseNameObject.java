package com.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 系统名称: crm-model
 * 系统版本：V5.0.1
 * 模块名称: 问卷管理
 * 类  名  称: BaseNameObject.java
 * 功能说明： 基础类 抽取了每个实体类的公用属性
 * 开发人员: yuzhili
 * 开发时间: 2017年8月10日
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class BaseNameObject extends BaseObject implements Serializable {

    /**
     * 序列号id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 名称
     */
    private String name;

    public BaseNameObject() {
    }

    public BaseNameObject(String name) {
        this.name = name;
    }

    public BaseNameObject(String creator, String name) {
        super(creator);
        this.name = name;
    }

    public BaseNameObject(String creator, String modifier, String name) {
        super(creator, modifier);
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .toString();
    }
}

