package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: zym
 * @ClassName: ActReputationBean
 * @Description: 热度值计算需要的分量, 由于动态与电影均需要计算,
 * 故将两者需要的分量合并在一张表
 * @Date: 2019/10/20 16:08
 * @Version: 1.0
 **/
@Component
public class ActReputationBean implements Serializable {
    private static final long serialVersionUID = 1024789547628811328L;

    /**动态(或者电影)的ID,与其信息表中的ID一致*/
    private String referId;
    /**类型, 0表示为动态, 1表示为电影*/
    private String type;
    /**发布时间,仅对动态有效*/
    private String postTime;
    /**最后回复时间, 仅对动态有效*/
    private String lastReplayTime;
    /**最后操作时间, 仅对动态有效*/
    private String lastOpTime;
    /**浏览量*/
    private String browse;
    /**分享量(动态), 或者总共的彩蛋数(电影)*/
    private String shareEgg;
    /**评论量(动态), 或者发布的总的故事数(电影)*/
    private String chatStory;
    /**点赞量(动态), 或者总的观后感的数(电影)*/
    private String likeFeeling;
    /**内容长度,仅对动态有效*/
    private String contentLength;
    /**图片数量, 仅对动态有效*/
    private String pictureNum;
    /**最终的热度值*/
    private String reputation;

    public String getReferId() {
        return referId;
    }

    public void setReferId(String referId) {
        this.referId = referId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getLastReplayTime() {
        return lastReplayTime;
    }

    public void setLastReplayTime(String lastReplayTime) {
        this.lastReplayTime = lastReplayTime;
    }

    public String getLastOpTime() {
        return lastOpTime;
    }

    public void setLastOpTime(String lastOpTime) {
        this.lastOpTime = lastOpTime;
    }

    public String getBrowse() {
        return browse;
    }

    public void setBrowse(String browse) {
        this.browse = browse;
    }

    public String getShareEgg() {
        return shareEgg;
    }

    public void setShareEgg(String shareEgg) {
        this.shareEgg = shareEgg;
    }

    public String getChatStory() {
        return chatStory;
    }

    public void setChatStory(String chatStory) {
        this.chatStory = chatStory;
    }

    public String getLikeFeeling() {
        return likeFeeling;
    }

    public void setLikeFeeling(String likeFeeling) {
        this.likeFeeling = likeFeeling;
    }

    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public String getPictureNum() {
        return pictureNum;
    }

    public void setPictureNum(String pictureNum) {
        this.pictureNum = pictureNum;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }
}
