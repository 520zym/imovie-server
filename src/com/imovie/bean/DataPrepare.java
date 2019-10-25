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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
