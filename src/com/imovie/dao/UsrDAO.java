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

    /**
     * 查看某人信息
     * @author zym
     * @date 2019/10/26 14:47
     * @param uid 被查看信息的用户的id
     * @return String
     **/
    UsrBean getUsrInfo(String uid);

    /**
     * 关注某人
     * @author zym
     * @date 2019/10/26 15:04
     * @param fanId 关注者
     * @param starId 被关注者
     * @return int
     **/
    int starUsr(String fanId, String starId);

    /**
     * 取消关注
     * @author zym
     * @date 2019/10/26 17:00
     * @param fanId 取消
     * @param starId 被取消
     * @return int
     **/
    int unStarUsr(String fanId, String starId);
}
