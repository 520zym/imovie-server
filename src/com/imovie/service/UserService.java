package com.imovie.service;

import com.imovie.bean.UsrBean;
import com.imovie.dao.usrDAO;
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
    private static final ApplicationContext applicationContext = SpringBeanUtil.getContext();

    /// 注册
    public static int Register(String uid, String name, String head, String gender) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsr_uid(uid);
        usrBean.setUsr_name(name);
        usrBean.setUsr_head(head);
        usrBean.setUsr_gender(gender);
        logger.info("uid=[" + uid + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "].");
        return applicationContext.getBean(usrDAO.class).usrRegister(usrBean);
    }

    /// 修改个人信息
    public static int modifyInfo(String name, String head, String gender, String profile, String id) {
        UsrBean usrBean = new UsrBean();
        usrBean.setUsr_name(name);
        usrBean.setUsr_head(head);
        usrBean.setUsr_gender(gender);
        usrBean.setUsr_profile(profile);
        usrBean.setUsr_id(id);
        logger.info("profile=[" + profile + "], name=[" + name + "], head=[" + head + "], gender=[" + gender + "], id=[" + id  +"].");
        return applicationContext.getBean(usrDAO.class).modifyInfo(usrBean);
    }
}
