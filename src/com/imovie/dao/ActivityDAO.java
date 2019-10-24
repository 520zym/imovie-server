package com.imovie.dao;

import com.imovie.bean.ActivityBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zym
 * @ClassName: ActivityDAO
 * @Description:
 * @Date: 2019/10/21 11:39
 * @Version: 1.0
 **/
@Repository
public interface ActivityDAO {
    /**
     * 发布新的动态, 第一步, 将信息插入 activity 表中
     * @param activityBean 动态实体
     * @return int
     **/
    int postActivity(ActivityBean activityBean);

    /**
     * 发布新动态, 第二步, 获取新插入的动态的ID
     * @return String
     */
    String getActId();

    /**
     * 发布新动态, 第三步, 将图片插入到 images表中
     * @param actId 动态ID
     * @param imageUrls 图片链接
     * @return int
     */
    int postImages(String actId, @Param("imageUrls") List<String> imageUrls);

    /**
     * 获取一系列动态(比如,刷新的动作), orderBy默认为reputation, 规则为降序desc
     * @param begin 起始
     * @param offset 偏移
     * @param orderColumn 排序列名
     * @return List<ActivityBean>
     **/
    List<ActivityBean> getActivities(String begin, String offset, String orderColumn);

    //按照热度值从大到小获取所有动态(根据前台刷新或请求的需求, 每次15条)
    //List<ActivityBean> getAllActByReputation();

    //按照热度值从大到小获取所有彩蛋信息(根据前台刷新或请求的需求, 每次15条)
    //List<ActivityBean> getAllEggByReputation();
}
