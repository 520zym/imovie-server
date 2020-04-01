package com.imovie.test;

import com.imovie.service.UserService;

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
        testRegister();
    }

    private static void generateId() {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(System.currentTimeMillis());
    }

    private static void testRegister() {
        String newId = UserService.register("123456789", "TestTestTest", "00.jpg", "1");
        System.out.println(newId);
    }
}
