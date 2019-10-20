package com.imovie.controller;

import com.imovie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zym
 * @ClassName: UsrController
 * @Description:
 * @Date: 2019/10/20 14:02
 * @Version: 1.0
 **/
@Controller
public class UsrController {
    @ResponseBody
    @RequestMapping(value = "/register")
    public String usrRegister(@RequestParam String uid, @RequestParam String name, @RequestParam String head, @RequestParam String gender) {
        return "{\"result\": \"" + UserService.Register(uid, name, head, gender) + "\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/user/modify")
    public String modifyInfo(@RequestParam String name, @RequestParam String head, @RequestParam String gender, @RequestParam String profile, @RequestParam String id) {
        return "{\"result\": \"" + UserService.modifyInfo(name, head, gender, profile, id) + "\"}";
    }
}
