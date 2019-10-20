package com.imovie.service;

import com.imovie.bean.TestMyBatis;
import com.imovie.dao.MybatisTest;
import com.imovie.util.SpringBeanUtil;
import org.springframework.stereotype.Service;

/**
 * @Author: zym
 * @ClassName: MVC_service
 * @Description:
 * @Date: 2019/10/20 9:31
 * @Version: 1.0
 **/
@Service
public class MVC_service {
    public static TestMyBatis getMyBatis(String age) {
        return SpringBeanUtil.getContext().getBean(MybatisTest.class).getBatis(age);
    }
}
