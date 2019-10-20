package com.imovie.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: zym
 * @ClassName: SpringBeanUtil
 * @Description:
 * @Date: 2019/10/19 22:02
 * @Version: 1.0
 **/
public class SpringBeanUtil implements ApplicationContextAware {
    private static final Logger logger = LogManager.getLogger(SpringBeanUtil.class);
    private static ApplicationContext context;

    static {
        try {
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warn("Now project dir path is: " + System.getProperty("user.dir"));
            context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        }
    }

    public static ApplicationContext getContext() {
        return context;
    }

    public static Object getBean(String id) {
        if (context.containsBean(id)) {
            return context.getBean(id);
        } else {
            return null;
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
