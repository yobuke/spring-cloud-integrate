package com.demo.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Collection;

/**
 * 父子类的泛型结构
 * 开发人员: yuzhili
 * 开发时间: 2017年8月10日
 *
 * @param <T> 所有继承自BaseObject的类
 */
public abstract class BaseTree<T extends BaseObject> extends BaseCodeObject {
    private T parent;
    private Collection<T> subCollection;

    public BaseTree() {
    }

    public BaseTree(String code, T parent, Collection<T> subCollection) {
        super(code);
        this.parent = parent;
        this.subCollection = subCollection;
    }

    public BaseTree(String name, String code, T parent, Collection<T> subCollection) {
        super(name, code);
        this.parent = parent;
        this.subCollection = subCollection;
    }

    public BaseTree(String creator, String name, String code, T parent, Collection<T> subCollection) {
        super(creator, name, code);
        this.parent = parent;
        this.subCollection = subCollection;
    }

    public BaseTree(String creator, String modifier, String name, String code, T parent, Collection<T> subCollection) {
        super(creator, modifier, name, code);
        this.parent = parent;
        this.subCollection = subCollection;
    }

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

    public Collection<T> getSubCollection() {
        return subCollection;
    }

    public void setSubCollection(Collection<T> subCollection) {
        this.subCollection = subCollection;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("parent", parent)
                .append("subCollection", subCollection)
                .toString();
    }
}
