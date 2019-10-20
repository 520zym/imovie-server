package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: zym
 * @ClassName: ActivityBean
 * @Description:
 * @Date: 2019/10/20 16:07
 * @Version: 1.0
 **/
@Component
public class ActivityBean implements Serializable {
    private static final long serialVersionUID = -8228719607274057543L;

    private String act_id;
    private String act_type;
    private String act_usr;
    private String act_content;
    private String act_imageRef;
    private String act_movie;
    private String act_label;

    public String getAct_id() {
        return act_id;
    }

    public void setAct_id(String act_id) {
        this.act_id = act_id;
    }

    public String getAct_type() {
        return act_type;
    }

    public void setAct_type(String act_type) {
        this.act_type = act_type;
    }

    public String getAct_usr() {
        return act_usr;
    }

    public void setAct_usr(String act_usr) {
        this.act_usr = act_usr;
    }

    public String getAct_content() {
        return act_content;
    }

    public void setAct_content(String act_content) {
        this.act_content = act_content;
    }

    public String getAct_imageRef() {
        return act_imageRef;
    }

    public void setAct_imageRef(String act_imageRef) {
        this.act_imageRef = act_imageRef;
    }

    public String getAct_movie() {
        return act_movie;
    }

    public void setAct_movie(String act_movie) {
        this.act_movie = act_movie;
    }

    public String getAct_label() {
        return act_label;
    }

    public void setAct_label(String act_label) {
        switch (act_label) {
            case "0":
                this.act_label = "彩蛋";
            case "1":
                this.act_label = "故事";
            case "2":
                this.act_label = "观后感";
            default:
                this.act_label = "Hello World!";
        }
    }
}
