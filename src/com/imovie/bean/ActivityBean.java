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
    private static final long serialVersionUID = 7740530161745608635L;

    private String act_id;         //每个动态的唯一标识, 自增吧
    private String act_type;       //动态的类型, 0=>彩蛋, 1=>故事, 2=>观后感
    private String act_usr;        //动态发布者的ID, 对应着 usr_id
    private String act_content;    //动态主体内容
    private String act_imageRef;   //图片参考索引值, 在表imageRef中, 每个imageRef对应一组图片的url
    private String act_movie;      //此次动态所对应的电影的movie_id
    private String act_label;      //此次动态的分类标签, 与act_type相对应

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
        switch (this.act_type) {
            case "0":
                this.act_label = "彩蛋";
                break;
            case "1":
                this.act_label = "故事";
                break;
            case "2":
                this.act_label = "观后感";
                break;
            default:
                this.act_label = "Hello World!";
                break;
        }
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
        this.act_label = act_label;
    }
}
