package com.imovie.service;

import com.imovie.bean.ActivityBean;
import com.imovie.dao.ActivityDAO;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zym
 * @ClassName: ActivityService
 * @Description:
 * @Date: 2019/10/20 17:03
 * @Version: 1.0
 **/
@Service
public class ActivityService {
    private static final Logger logger = LogManager.getLogger(ActivityService.class);
    private static final ApplicationContext APPLICATION_CONTEXT = SpringBeanUtil.getContext();

    /**
     * 发布动态
     * @author zym
     * @date 2019/10/23 18:21
     * @param actType 动态类型
     * @param actUsr 发布者ID
     * @param actContent 主体内容
     * @param actImageRef 图片
     * @param actMovie 关联电影
     * @return int
     **/
    public static int postActivity(String actType, String actUsr, String actContent, String actImageRef, String actMovie) {
        ActivityBean activityBean = new ActivityBean();
        activityBean.setActType(actType);
        activityBean.setActUsr(actUsr);
        activityBean.setActContent(actContent);
        activityBean.setActMovie(actMovie);
        activityBean.setActImageRef(actImageRef);
        logger.info("actImageRef=[" + actImageRef + "].");
        return APPLICATION_CONTEXT.getBean(ActivityDAO.class).postActivity(activityBean);
    }

    /**
     * 获取一组动态
     * @author zym
     * @date 2019/10/23 18:22
     * @param begin 返回List第一个元素在数据表中的下标
     * @param offset 获取的动态条数
     * @param orderColumn 排序列名
     * @return List<ActivityBean>
     **/
    public static List<ActivityBean> getActivities(String begin, String offset, String orderColumn) {
        List<ActivityBean> activityBeanList = APPLICATION_CONTEXT.getBean(ActivityDAO.class).getActivities(begin, offset, orderColumn);
        logger.info("activityList's size is [" + activityBeanList.size() + "]");
        return activityBeanList;
    }
}
