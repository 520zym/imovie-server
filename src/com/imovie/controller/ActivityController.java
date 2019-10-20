package com.imovie.controller;

import com.imovie.bean.ActivityBean;
import com.imovie.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    @RequestMapping(value = "/activity/post")
    public String postActivity(@RequestParam String actType, @RequestParam String actUsr, @RequestParam String actContent, String actImageRef, @RequestParam String actMovie) {
        return "{\"result\": \"" + ActivityService.postActivity(actType, actUsr, actContent, actImageRef, actMovie) + "\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/activity/get")
    // TODO: select语句还需要联合reputation表以及imageRef表, 还有usrInfo表, movieinfo表
    public List<ActivityBean> getActivities(@RequestParam String begin, @RequestParam String offset, @RequestParam(defaultValue = "reputation") String orderColumn) {
        return ActivityService.getActivities(begin, offset, orderColumn);
    }
}
