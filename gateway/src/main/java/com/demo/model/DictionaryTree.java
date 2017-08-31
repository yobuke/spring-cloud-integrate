package com.demo.model;

import java.util.Collection;

/**
 * 数据字典
 */
public class DictionaryTree extends BaseTree<DictionaryTree> {
    public DictionaryTree() {
    }

    public DictionaryTree(String code, DictionaryTree parent, Collection<DictionaryTree> subCollection) {
        super(code, parent, subCollection);
    }

    public DictionaryTree(String name, String code, DictionaryTree parent, Collection<DictionaryTree> subCollection) {
        super(name, code, parent, subCollection);
    }

    public DictionaryTree(String creator, String name, String code, DictionaryTree parent, Collection<DictionaryTree> subCollection) {
        super(creator, name, code, parent, subCollection);
    }

    public DictionaryTree(String creator, String modifier, String name, String code, DictionaryTree parent, Collection<DictionaryTree> subCollection) {
        super(creator, modifier, name, code, parent, subCollection);
    }
}
