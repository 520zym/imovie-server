package com.imovie.test;

import java.util.UUID;

/**
 * @Author: zym
 * @ClassName: FunctionTest
 * @Description:
 * @Date: 2019/10/20 15:24
 * @Version: 1.0
 **/
public class FunctionTest {
    public static void main(String[] args) {
        generateId();
    }

    private static void generateId() {
        System.out.println(UUID.randomUUID());
        System.out.println(System.currentTimeMillis());
    }
}
