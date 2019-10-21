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
     * @Date: 2019/10/21 11:45
     * @Param: [usrBean]
     * @Return: int
     **/
    int usrRegister(UsrBean usrBean);
    
    /**
     * 修改个人信息
     * @Date: 2019/10/21 11:50
     * @Param: [usrBean]
     * @Return: int
     * @throws:
     **/
    int modifyInfo(UsrBean usrBean);
}
