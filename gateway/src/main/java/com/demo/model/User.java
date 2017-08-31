package com.demo.model;

/**
 * 用户
 */
public class User extends BaseNameObject {
    private Tenant tenant;

    public User() {
    }

    public User(String name) {
        super(name);
    }

    public User(String creator, String name) {
        super(creator, name);
    }

    public User(String creator, String modifier, String name) {
        super(creator, modifier, name);
    }

    public User(Tenant tenant, String name) {
        super(name);
        this.tenant = tenant;
    }

    public User(String creator, Tenant tenant, String name) {
        super(creator, name);
        this.tenant = tenant;
    }

    public User(String creator, String modifier, Tenant tenant, String name) {
        super(creator, modifier, name);
        this.tenant = tenant;
    }

}
