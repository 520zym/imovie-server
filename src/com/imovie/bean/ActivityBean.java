package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zym
 * @ClassName: ActivityBean
 * @Description:
 * @Date: 2019/10/20 16:07
 * @Version: 1.0
 **/
@Component
public class ActivityBean implements Serializable {
    private static final long serialVersionUID = 1187476048642479490L;

    /**每个动态的唯一标识, 自增吧*/
    private String actId;
    /**动态的类型, 0=>彩蛋, 1=>故事, 2=>观后感*/
    private String actType;
    /**动态发布者的ID, 对应着 usr_id*/
    private String actUsr;
    /**动态主体内容*/
    private String actContent;
    /**图片参考索引值, 在表imageRef中, 每个imageRef对应一组图片的url*/
    private String actImageNum;
    private List<String> imageFiles;
    /**此次动态所对应的电影的movie_id*/
    private String actMovie;
    /**此次动态的分类标签, 与act_type相对应*/
    private String actLabel;
    /**此次动态的分享量*/
    private String shareNum;
    /**此次动态的评论量*/
    private String chatNum;
    /**此次动态的点赞量*/
    private String likeNum;
    /**此次动态的发布时间*/
    private String postTime;

    public String getShareNum() {
        return shareNum;
    }

    public void setShareNum(String shareNum) {
        this.shareNum = shareNum;
    }

    public String getChatNum() {
        return chatNum;
    }

    public void setChatNum(String chatNum) {
        this.chatNum = chatNum;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
        switch (this.actType) {
            case "0":
                this.actLabel = "彩蛋";
                break;
            case "1":
                this.actLabel = "故事";
                break;
            case "2":
                this.actLabel = "观后感";
                break;
            default:
                this.actLabel = "Hello World!";
                break;
        }
    }

    public String getActUsr() {
        return actUsr;
    }

    public void setActUsr(String actUsr) {
        this.actUsr = actUsr;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public String getActImageNum() {
        return actImageNum;
    }

    public void setActImageNum(String actImageNum) {
        this.actImageNum = actImageNum;
    }

    public List<String> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<String> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public String getActMovie() {
        return actMovie;
    }

    public void setActMovie(String actMovie) {
        this.actMovie = actMovie;
    }

    public String getActLabel() {
        return actLabel;
    }

    public void setActLabel(String actLabel) {
        this.actLabel = actLabel;
    }
}
