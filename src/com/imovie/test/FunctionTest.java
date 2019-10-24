package com.imovie.test;

import com.imovie.service.ActivityService;

import java.util.Arrays;
import java.util.List;
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
        //generateId();
        testPostAct();
    }

    private static void generateId() {
        System.out.println(UUID.randomUUID());
        System.out.println(System.currentTimeMillis());
    }

    private static void testPostAct() {
        int result = ActivityService.postActivity("1", "1", "我真的好饿啊啊啊",
                "3", "1291546", Arrays.asList("1.jpg", "2.jpg", "3.jpg"));
        System.out.println("最终结果: " + result);
    }
}
