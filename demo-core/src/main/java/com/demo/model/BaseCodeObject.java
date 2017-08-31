package com.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 系统名称: crm-model
 * 系统版本：V5.0.1
 * 模块名称: 问卷管理
 * 类  名  称: BaseCodeObject.java
 * 功能说明： 基础类 抽取了每个实体类的公用属性
 * 开发人员: yuzhili
 * 开发时间: 2017年8月10日
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期 修改人员 修改说明
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public abstract class BaseCodeObject extends BaseNameObject implements Serializable {

    /**
     * 序列号id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 编码
     */
    private String code;

    public BaseCodeObject() {
    }

    public BaseCodeObject(String code) {
        this.code = code;
    }

    public BaseCodeObject(String name, String code) {
        super(name);
        this.code = code;
    }

    public BaseCodeObject(String creator, String name, String code) {
        super(creator, name);
        this.code = code;
    }

    public BaseCodeObject(String creator, String modifier, String name, String code) {
        super(creator, modifier, name);
        this.code = code;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("code", code)
                .toString();
    }
}

