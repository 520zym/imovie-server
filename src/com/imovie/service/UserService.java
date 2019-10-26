package com.imovie.service;

import com.imovie.bean.UsrBean;
import com.imovie.dao.UsrDAO;
import com.imovie.util.ImageUtil;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: zym
 * @ClassName: UserService
 * @Description:
 * @Date: 2019/10/20 13:37
 * @Version: 1.0
 **/
@Service
public class UserService {
    private static final Logger LOGGER = LogManager.getLogger(UserService.class);
    private static final UsrDAO USR_DAO = SpringBeanUtil.getContext().getBean(UsrDAO.class);

    /**
     * 注册
     * @author zym
     * @date 2019/10/21 11:48
     * @param uid 32位ID
     * @param name 昵称
     * @param head 头像链接
     * @param gender 性别
     * @Return: int
     **/
    public static int register(String uid, String name, String head, String gender) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsrUid(uid);
        usrBean.setUsrName(name);
        usrBean.setUsrHead(head);
        usrBean.setUsrGender(gender);
        LOGGER.info("uid=[" + uid + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "].");
        return USR_DAO.usrRegister(usrBean);
    }

    /**
     * 修改个人信息
     * @author zym
     * @date 2019/10/21 11:48
     * @param name 昵称
     * @param gender 性别
     * @param profile 用户简介
     * @param id 用户唯一识别ID
     * @return java.lang.String
     **/
    public static int modifyInfo(String name, String head, String gender, String profile, String id, MultipartFile headImage) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsrName(name);
        usrBean.setUsrHead(ImageUtil.saveImageFile(headImage));
        usrBean.setUsrGender(gender);
        usrBean.setUsrProfile(profile);
        usrBean.setUsrId(id);
        LOGGER.info("profile=[" + profile + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "], id=[" + id  +"].");
        return USR_DAO.modifyInfo(usrBean);
    }

    /**
     * 查看某人信息
     * @author zym
     * @date 2019/10/26 14:52
     * @param uid 被查看信息的用户的id
     * @return String
     **/
    public static UsrBean getUsrInfo(String uid) {
        LOGGER.info("查找用户 [" + uid + "] 的信息...");
        return USR_DAO.getUsrInfo(uid);
    }

    /**
     * 关注操作
     * @author zym
     * @date 2019/10/26 14:55
     * @param fanId 粉丝ID
     * @param starId 被关注者ID
     * @return int
     **/
    public static int starUsr(String fanId, String starId) {
        LOGGER.info("用户 [" + fanId + "] 关注了用户 [" + starId + "]...");
        return USR_DAO.starUsr(fanId, starId);
    }

    /**
     * 取消关注
     * @author zym
     * @date 2019/10/26 17:08
     * @param fanId 取消
     * @param starId 被取消
     * @return int
     **/
    public static int unStarUsr(String fanId, String starId) {
        LOGGER.info("用户 [" + fanId + "] 取消了对 [" + starId + "] 的关注.");
        return USR_DAO.unStarUsr(fanId, starId);
    }
}
