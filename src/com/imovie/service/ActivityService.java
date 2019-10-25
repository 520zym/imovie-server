package com.imovie.service;

import com.imovie.bean.ActivityBean;
import com.imovie.dao.ActivityDAO;
import com.imovie.util.GenerateUtil;
import com.imovie.util.ImageUtil;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zym
 * @ClassName: ActivityService
 * @Description:
 * @Date: 2019/10/20 17:03
 * @Version: 1.0
 **/
@Service
public class ActivityService {
    private static final Logger LOGGER = LogManager.getLogger(ActivityService.class);
    private static final ActivityDAO ACTIVITY_DAO = SpringBeanUtil.getContext().getBean(ActivityDAO.class);

    /**
     * 发布动态
     * @author zym
     * @date 2019/10/23 18:21
     * @param actType 动态类型
     * @param actUsr 发布者ID
     * @param actContent 主体内容
     * @param actImageNum 图片
     * @param actMovie 关联电影
     * @param imageFiles 图片数组
     * @return int
     **/
    public static int postActivity(String actType, String actUsr, String actContent, String actImageNum,
                                   String actMovie, List<MultipartFile> imageFiles) {
        /*预处理*/
        actImageNum = GenerateUtil.nullToZero(actImageNum);

        ActivityBean activityBean = new ActivityBean();
        activityBean.setActType(actType);
        activityBean.setActUsr(actUsr);
        activityBean.setActContent(actContent);
        activityBean.setActMovie(actMovie);
        activityBean.setActImageNum(actImageNum);

        /*动态信息插入activity表*/
        int insertAct = ACTIVITY_DAO.postActivity(activityBean);
        String zero = "0";
        if (!zero.equals(actImageNum)) {
            /*获取其ID*/
            String actId = ACTIVITY_DAO.getActId();
            LOGGER.info("The new actId is [" + actId + "].");
            /*保存图片, 并获取新的文件名*/
            List<String> imageNames = ImageUtil.saveImageFileList(imageFiles);
            /*插入图片信息*/
            LOGGER.info("The images is " + imageNames);
            ACTIVITY_DAO.postImages(actId, imageNames);
        }

        if (insertAct > 0) {
            return 1;
        }
        return 0;
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
    public static Map<String, ActivityBean> getActivities(String begin, String offset, String orderColumn) {
        Map<String, ActivityBean> activityBeanMap = new LinkedHashMap<>();
        List<ActivityBean> activityBeanList = ACTIVITY_DAO.getActivities(begin, offset, orderColumn);
        for (ActivityBean activity: activityBeanList) {
            activityBeanMap.put(activity.getActId(), activity);
        }

        LOGGER.info("activityList's size is [" + activityBeanList.size() + "]");
        return activityBeanMap;
    }
}
