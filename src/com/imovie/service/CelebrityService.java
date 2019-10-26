package com.imovie.service;

import com.imovie.bean.CelebrityBean;
import com.imovie.dao.CelebrityDAO;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author zym
 * @version 1.0
 * @classname CelebrityService
 * @description
 * @date 2019/10/26 22:29
 **/
@Service
public class CelebrityService {
    private static final Logger LOGGER = LogManager.getLogger(CelebrityService.class);
    private static final CelebrityDAO CELEBRITY_DAO = SpringBeanUtil.getContext().getBean(CelebrityDAO.class);

    /**
     * 获取职员信息
     * @author zym
     * @date 2019/10/26 22:33
     * @param celebrityId 职员ID
     * @return com.imovie.bean.CelebrityBean
     **/
    public static CelebrityBean getCelebrityInfo(String celebrityId) {
        LOGGER.info("正在获取职员 [" + celebrityId + "] 的信息...");
        return CELEBRITY_DAO.getCelebrityInfo(celebrityId);
    }
}
