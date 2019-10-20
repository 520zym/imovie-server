package com.imovie.dao;

import com.imovie.bean.ActivityBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityDAO {
    //发布新的动态
    int postActivity(ActivityBean activityBean);

    //获取一系列动态(比如,刷新的动作), orderBy默认为reputation, 规则为降序desc
    List<ActivityBean> getActivities(String begin, String offset, String orderColumn);

    //按照热度值从大到小获取所有动态(根据前台刷新或请求的需求, 每次15条)
    //List<ActivityBean> getAllActByReputation();

    //按照热度值从大到小获取所有彩蛋信息(根据前台刷新或请求的需求, 每次15条)
    //List<ActivityBean> getAllEggByReputation();
}
