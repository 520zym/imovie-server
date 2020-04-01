package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zym
 * @version 1.0
 * @classname DataPrepare
 * @description
 * @date 2019/10/25 22:58
 **/
@Component
public class DataPrepare implements Serializable {
    private static final long serialVersionUID = 3775167448619601200L;

    private String imagePath;
    private int idLength;

    /**为动态中的图片服务*/

    public int getIdLength() {
        return idLength;
    }

    public void setIdLength(int idLength) {
        this.idLength = idLength;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
