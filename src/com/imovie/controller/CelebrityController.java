package com.imovie.controller;

import com.imovie.bean.CelebrityBean;
import com.imovie.service.CelebrityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zym
 * @version 1.0
 * @classname CelebrityController
 * @description
 * @date 2019/10/26 22:29
 **/
@Controller
public class CelebrityController {
    @ResponseBody
    @RequestMapping(value = "/celebrity/detail")
    public CelebrityBean getCelebrityInfo(@RequestParam String celebrityId) {
        return CelebrityService.getCelebrityInfo(celebrityId);
    }
}
