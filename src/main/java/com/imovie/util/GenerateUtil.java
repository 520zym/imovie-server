package com.imovie.util;

/**
 * @Author: zym
 * @ClassName: GenerateUtil
 * @Description: 主要用于生成唯一标识等功能
 * @Date: 2019/10/20 15:12
 * @Version: 1.0
 **/
public class GenerateUtil {
    public static String nullToZero(String argument) {
        if (argument == null) {
            return "0";
        }
        return argument;
    }

    public static String nullToBlank(String argument) {
        if (argument == null) {
            return "";
        }
        return argument;
    }
}
