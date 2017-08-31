package com.demo.util;

import java.util.UUID;

/**
 * @Authur yuzhili
 */
public final class UUIDGenerator {

    /**
     * 获得一个UUID
     *
     * @return UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
