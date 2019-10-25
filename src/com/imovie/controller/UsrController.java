package com.imovie.controller;

import com.imovie.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: zym
 * @ClassName: UsrController
 * @Description:
 * @Date: 2019/10/20 14:02
 * @Version: 1.0
 **/
@Controller
public class UsrController {
    /**
     * 注册
     * @author zym
     * @date 2019/10/23 18:14
     * @param uid 32位ID
     * @param name 昵称
     * @param head 头像链接
     * @param gender 性别
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping(value = "/user/register")
    public String usrRegister(@RequestParam String uid, @RequestParam String name, @RequestParam String head, @RequestParam String gender) {
        return "{\"result\": \"" + UserService.register(uid, name, head, gender) + "\"}";
    }

    /**
     * 修改个人资料
     * @author zym
     * @date 2019/10/23 18:15
     * @param name 昵称
     * @param head 头像链接
     * @param gender 性别
     * @param profile 用户简介
     * @param id 用户唯一识别ID
     * @param headImage 用户头像图片
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping(value = "/user/modify")
    public String modifyInfo(@RequestParam String name, @RequestParam String head, @RequestParam String gender,
                             @RequestParam String profile, @RequestParam String id, MultipartFile headImage) {
        return "{\"result\": \"" + UserService.modifyInfo(name, head, gender, profile, id, headImage) + "\"}";
    }
}
