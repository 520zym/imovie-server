package com.imovie.test;

import com.imovie.bean.TestMyBatis;
import com.imovie.mapper.MybatisTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zym
 * @ClassName: MyBatisTest
 * @Description:
 * @Date: 2019/10/19 20:27
 * @Version: 1.0
 **/
public class MyBatisTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MybatisTest mybatisTest = context.getBean(MybatisTest.class);
        TestMyBatis batis = new TestMyBatis();
        batis.setName("name_mapper");
        batis.setAge("age_mapper");
        System.out.println("insert****" + mybatisTest.insertOne(batis));
        System.out.println(mybatisTest.getBatis("123").getName());
    }
}
