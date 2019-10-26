package com.imovie.util;

import com.imovie.bean.DataPrepare;

/**
 * @author zym
 * @version 1.0
 * @classname ConstantUtil
 * @description
 * @date 2019/10/26 19:50
 **/
public class ConstantUtil {
    private static DataPrepare DATA_PREPARE = (DataPrepare) SpringBeanUtil.getBean("dataPrepare");

    /**各种常量*/
    static final String IMAGE_PATH = DATA_PREPARE.getImagePath();
    public static final int ID_LENGTH = DATA_PREPARE.getIdLength();
}
