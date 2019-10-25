package com.imovie.service;

import com.imovie.bean.UsrBean;
import com.imovie.dao.UsrDAO;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

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
    public static int modifyInfo(String name, String head, String gender, String profile, String id) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsrName(name);
        usrBean.setUsrHead(head);
        usrBean.setUsrGender(gender);
        usrBean.setUsrProfile(profile);
        usrBean.setUsrId(id);
        LOGGER.info("profile=[" + profile + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "], id=[" + id  +"].");
        return USR_DAO.modifyInfo(usrBean);
    }
}
