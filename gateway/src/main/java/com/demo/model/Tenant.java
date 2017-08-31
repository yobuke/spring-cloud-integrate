package com.demo.model;

/**
 * 租户
 */
public class Tenant extends BaseNameObject {
    public Tenant() {
    }

    public Tenant(String name) {
        super(name);
    }

    public Tenant(String creator, String name) {
        super(creator, name);
    }

    public Tenant(String creator, String modifier, String name) {
        super(creator, modifier, name);
    }
}
