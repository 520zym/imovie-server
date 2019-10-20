package com.imovie.dao;

import com.imovie.bean.UsrBean;
import org.springframework.stereotype.Repository;

@Repository
public interface usrDAO {
    //用户首次第三方登录,需要将自己的信息插入数据库
    int usrRegister(UsrBean usrBean);
    //用户修改个人信息
    int modifyInfo(UsrBean usrBean);
}
