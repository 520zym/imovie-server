package com.imovie.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: zym
 * @ClassName: TestMyBatis
 * @Description:
 * @Date: 2019/10/19 19:18
 * @Version: 1.0
 **/
@Component
public class TestMyBatis {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
