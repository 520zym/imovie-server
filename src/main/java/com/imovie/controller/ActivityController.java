package com.imovie.controller;

import com.imovie.bean.ActivityBean;
import com.imovie.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zym
 * @ClassName: ActivityController
 * @Description:
 * @Date: 2019/10/20 17:07
 * @Version: 1.0
 **/
@Controller
public class ActivityController {
    /**
     * 发布动态
     * @author zym
     * @date 2019/10/23 18:08
     * @param actType 动态类型
     * @param actUsr 发布者
     * @param actContent 发布内容
     * @param actImageNum 图片数量
     * @param actMovie 关联电影
     * @param imageFiles 一组图片
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping(value = "/activity/post")
    public String postActivity(@RequestParam String actType, @RequestParam String actUsr, @RequestParam String actContent,
                               String actImageNum, @RequestParam String actMovie, List<MultipartFile> imageFiles) {
        return "{\"result\": \"" + ActivityService.postActivity(actType, actUsr, actContent, actImageNum, actMovie, imageFiles) + "\"}";
    }

    /**
     * 获取动态列表
     * @author zym
     * @date 2019/10/23 18:12
     * @param begin 列表开始的下标
     * @param offset 列表size, 多少条动态
     * @param orderColumn 排序列名
     * @return java.util.List<com.imovie.bean.ActivityBean>
     **/
    @ResponseBody
    @RequestMapping(value = "/activity/get")
    public List<ActivityBean> getActivities(@RequestParam String begin, @RequestParam String offset, @RequestParam(defaultValue = "reputation") String orderColumn) {
        return new ArrayList<>(ActivityService.getActivities(begin, offset, orderColumn).values());
    }
}
