package com.demo.model;

import java.util.Collection;

public class MenuTree extends BaseTree<MenuTree> {
    public MenuTree() {
    }

    public MenuTree(String code, MenuTree parent, Collection<MenuTree> subCollection) {
        super(code, parent, subCollection);
    }

    public MenuTree(String name, String code, MenuTree parent, Collection<MenuTree> subCollection) {
        super(name, code, parent, subCollection);
    }

    public MenuTree(String creator, String name, String code, MenuTree parent, Collection<MenuTree> subCollection) {
        super(creator, name, code, parent, subCollection);
    }

    public MenuTree(String creator, String modifier, String name, String code, MenuTree parent, Collection<MenuTree> subCollection) {
        super(creator, modifier, name, code, parent, subCollection);
    }
}
