package com.imovie.util;

import com.imovie.bean.DataPrepare;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zym
 * @version 1.0
 * @classname ImageUtil
 * @description 图片处理工具, 主要是存储图片
 * @date 2019/10/24 20:32
 **/
public class ImageUtil {
    private static final Logger LOGGER = LogManager.getLogger(ImageUtil.class);
    private static DataPrepare dataPrepare = (DataPrepare) SpringBeanUtil.getBean("dataPrepare");

    /**
     * 获取文件新的名字
     * @author zym
     * @date 2019/10/25 20:59
     * @param imageFile Spring MVC途径获取的文件
     * @return String 文件新名称
     **/
    private static String getNewName(MultipartFile imageFile) {
        String originFileName = imageFile.getOriginalFilename();
        return System.currentTimeMillis() + originFileName.substring(originFileName.lastIndexOf("."));
    }

    /**
     * 存储文件, 并返回文件新的名字; 存储不成功, 则返回 0
     * @author zym
     * @date 2019/10/25 21:00
     * @param imageFile 上传的图片
     * @return String
     **/
    public static String saveImageFile(MultipartFile imageFile) {
        if (imageFile != null) {
            String fileName = getNewName(imageFile);
            String filePath = dataPrepare.getImagePath() + fileName;
            try {
                //存储文件
                imageFile.transferTo(new File(filePath));
            } catch (IOException e) {
                LOGGER.error("文件存储失败! filePath=[" + filePath + "].");
                e.printStackTrace();
                return "error.jpg";
            }
            return fileName;
        }
        return "error.jpg";
    }

    /**
     * 存储一组图片
     * @author zym
     * @date 2019/10/25 21:10
     * @param imageFileList 一组图片
     * @return List
     **/
    public static List<String> saveImageFileList(List<MultipartFile> imageFileList) {
        List<String> imageNames = new ArrayList<>();
        for (MultipartFile imageFile : imageFileList) {
            imageNames.add(saveImageFile(imageFile));
        }
        return imageNames;
    }
}
