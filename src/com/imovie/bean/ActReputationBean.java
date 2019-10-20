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
    private static final long serialVersionUID = 6510344450901246883L;

    private String referID;           //动态(或者电影)的ID,与其信息表中的ID一致
    private String type;              //类型, 0表示为动态, 1表示为电影
    private String postTime;          //发布时间,仅对动态有效
    private String last_replay_time;  //最后回复时间, 仅对动态有效
    private String last_op_time;      //最后操作时间, 仅对动态有效
    private String browse;            //浏览量
    private String shareEgg;          //分享量(动态), 或者总共的彩蛋数(电影)
    private String chatStory;         //评论量(动态), 或者发布的总的故事数(电影)
    private String likeFeeling;       //点赞量(动态), 或者总的观后感的数(电影)
    private String content_length;    //内容长度,仅对动态有效
    private String picture_num;       //图片数量, 仅对动态有效
    private String reputation;        //最终的热度值

    public String getReferID() {
        return referID;
    }

    public void setReferID(String referID) {
        this.referID = referID;
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

    public String getLast_replay_time() {
        return last_replay_time;
    }

    public void setLast_replay_time(String last_replay_time) {
        this.last_replay_time = last_replay_time;
    }

    public String getLast_op_time() {
        return last_op_time;
    }

    public void setLast_op_time(String last_op_time) {
        this.last_op_time = last_op_time;
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

    public String getContent_length() {
        return content_length;
    }

    public void setContent_length(String content_length) {
        this.content_length = content_length;
    }

    public String getPicture_num() {
        return picture_num;
    }

    public void setPicture_num(String picture_num) {
        this.picture_num = picture_num;
    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }
}
