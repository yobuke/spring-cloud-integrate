package com.demo.model;

import java.util.Collection;

/**
 * 组织
 */
public class OrganizeTree extends BaseTree<OrganizeTree> {
    public OrganizeTree() {
    }

    public OrganizeTree(String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(code, parent, subCollection);
    }

    public OrganizeTree(String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(name, code, parent, subCollection);
    }

    public OrganizeTree(String creator, String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(creator, name, code, parent, subCollection);
    }

    public OrganizeTree(String creator, String modifier, String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(creator, modifier, name, code, parent, subCollection);
    }

    public OrganizeTree(Tenant tenant, String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(name, code, parent, subCollection);
    }

    public OrganizeTree(String creator, Tenant tenant, String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(creator, name, code, parent, subCollection);
    }

    public OrganizeTree(String creator, String modifier, Tenant tenant, String name, String code, OrganizeTree parent, Collection<OrganizeTree> subCollection) {
        super(creator, modifier, name, code, parent, subCollection);
    }
}
