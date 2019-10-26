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
     * 返回新生成的usr_id
     * @author zym
     * @date 2019/10/21 11:45
     * @param usrBean 用户信息实体
     * @return int
     **/
    int usrRegister(UsrBean usrBean);

    /**
     * 获取新生成的ID
     * @author zym
     * @date 2019/10/26 23:19
     * @return String
     **/
    String getNewId();
    
    /**
     * 修改个人信息, 不包括头像
     * @author zym
     * @date 2019/10/21 11:50
     * @param usrBean 用户信息实体
     * @return int
     **/
    int modifyInfo(UsrBean usrBean);

    /**
     * 查看某人信息, 根据自主生成的usrId
     * @author zym
     * @date 2019/10/26 14:47
     * @param usrId 被查看信息的用户的usrId
     * @return UsrBean
     **/
    UsrBean getUsrInfo(String usrId);

    /**
     * 通过第三方提供的uid查询
     * @author zym
     * @date 2019/10/26 19:38
     * @param uid 第三方登录提供的uid
     * @return UsrBean
     **/
    UsrBean getUsrInfoByUid(String uid);

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
