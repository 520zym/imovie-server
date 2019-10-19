package com.imovie.test;

import com.imovie.bean.TestMyBatis;
import com.imovie.mapper.MybatisTest;
import com.imovie.util.SpringBeanUtil;

/**
 * @Author: zym
 * @ClassName: MyBatisTest
 * @Description:
 * @Date: 2019/10/19 20:27
 * @Version: 1.0
 **/
public class MyBatisTest {
    public static void main(String[] args) {
        MybatisTest mybatisTest = SpringBeanUtil.getContext().getBean(MybatisTest.class);
        TestMyBatis batis = new TestMyBatis();
        batis.setName("name_mapper");
        batis.setAge("age_mapper");
        System.out.println("insert****" + mybatisTest.insertOne(batis));
        System.out.println(mybatisTest.getBatis("123").getName());
    }
}
