package com.imovie.test;

import com.imovie.service.ActivityService;

import java.util.Arrays;
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
        System.out.println(UUID.randomUUID().toString());
        System.out.println(System.currentTimeMillis());
    }
}
