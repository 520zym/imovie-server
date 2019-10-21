package com.imovie.service;

import com.imovie.bean.UsrBean;
import com.imovie.dao.UsrDAO;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
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
    private static final Logger logger = LogManager.getLogger(UserService.class);
    private static final ApplicationContext APPLICATION_CONTEXT = SpringBeanUtil.getContext();

    /**
     * @Author: zym
     * @Description: 注册
     * @Date: 2019/10/21 11:48
     * @Param: [uid, name, head, gender]
     * @Return: int
     * @throws:
     **/
    public static int register(String uid, String name, String head, String gender) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsrUid(uid);
        usrBean.setUsrName(name);
        usrBean.setUsrHead(head);
        usrBean.setUsrGender(gender);
        logger.info("uid=[" + uid + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "].");
        return APPLICATION_CONTEXT.getBean(UsrDAO.class).usrRegister(usrBean);
    }

    /**
     * @Author: zym
     * @Description: 修改个人信息
     * @Date: 2019/10/21 11:48
     * @Param: [name, head, gender, profile, id]
     * @Return: int
     * @throws:
     **/
    public static int modifyInfo(String name, String head, String gender, String profile, String id) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsrName(name);
        usrBean.setUsrHead(head);
        usrBean.setUsrGender(gender);
        usrBean.setUsrProfile(profile);
        usrBean.setUsrId(id);
        logger.info("profile=[" + profile + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "], id=[" + id  +"].");
        return APPLICATION_CONTEXT.getBean(UsrDAO.class).modifyInfo(usrBean);
    }
}
