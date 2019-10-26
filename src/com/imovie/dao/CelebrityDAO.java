package com.imovie.dao;

import com.imovie.bean.CelebrityBean;
import org.springframework.stereotype.Repository;

/**
 * @author zym
 * @version 1.0
 * @classname CelebrityDAO
 * @description
 * @date 2019/10/26 21:39
 **/
@Repository
public interface CelebrityDAO {
    /**
     * 根据ID获取该人员信息
     * @author zym
     * @date 2019/10/26 21:40
     * @param celebrityId 人员ID
     * @return celebrityBean
     **/
    CelebrityBean getCelebrityInfo(String celebrityId);
}
