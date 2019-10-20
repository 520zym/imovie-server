package com.imovie.controller;

import com.imovie.bean.TestMyBatis;
import com.imovie.service.MVC_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zym
 * @ClassName: testMVC
 * @Description:
 * @Date: 2019/10/20 8:42
 * @Version: 1.0
 **/
@Controller
public class testMVC {
    @ResponseBody
    @RequestMapping(value = "/test")
    public TestMyBatis getBatis() {
        return MVC_service.getMyBatis("123");
    }

    @ResponseBody
    @RequestMapping(name = "/param")
    public TestMyBatis useParam(@RequestParam String age) {
        return MVC_service.getMyBatis(age);
    }
}
