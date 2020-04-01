package com.imovie.controller;

import com.imovie.bean.UsrBean;
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

    /**
     * 查看某人信息
     * @author zym
     * @date 2019/10/26 14:53
     * @param uid 被查看信息的用户的id
     * @return String
     **/
    @ResponseBody
    @RequestMapping(value = "/user/visit")
    public UsrBean getUsrInfo(@RequestParam String uid) {
        return UserService.getUsrInfo(uid);
    }

    /**
     * 关注操作
     * @author zym
     * @date 2019/10/26 15:10
     * @param fanId 关注者
     * @param starId 被关注者
     * @return int
     **/
    @ResponseBody
    @RequestMapping(value = "/user/starUsr")
    public String starUsr(@RequestParam String fanId, @RequestParam String starId) {
        return "{\"result\": \"" + UserService.starUsr(fanId, starId) + "\"}";
    }

    /**
     * 取消关注
     * @author zym
     * @date 2019/10/26 17:10
     * @param fanId 取消
     * @param starId 被取消
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping(value = "/user/unStarUsr")
    public String unStarUsr(@RequestParam String fanId, @RequestParam String starId) {
        return "{\"result\": \"" + UserService.unStarUsr(fanId, starId) + "\"}";
    }
}
