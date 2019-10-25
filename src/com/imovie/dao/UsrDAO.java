package com.imovie.dao;

import com.imovie.bean.UsrBean;
import org.springframework.stereotype.Repository;

/**
 * @author zym
 */
@Repository
public interface UsrDAO {
    /**
     * 用户首次第三方登录,需要将自己的信息插入数据库
     * @author zym
     * @date 2019/10/21 11:45
     * @param usrBean 用户信息实体
     * @return int
     **/
    int usrRegister(UsrBean usrBean);
    
    /**
     * 修改个人信息, 不包括头像
     * @author zym
     * @date 2019/10/21 11:50
     * @param usrBean 用户信息实体
     * @return int
     **/
    int modifyInfo(UsrBean usrBean);
}
