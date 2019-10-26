package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: zym
 * @ClassName: UsrBean
 * @Description:
 * @Date: 2019/10/20 11:51
 * @Version: 1.0
 **/
@Component
public class UsrBean implements Serializable {
    private static final long serialVersionUID = 8126012199000654196L;

    private String usrId;
    private String usrUid;
    private String usrName;
    private String usrHead;
    private String usrGender;
    private String usrReg;
    private String usrProfile;
    private String usrEggs;
    private String usrStories;
    private String usrFeelings;
    /**关注量*/
    private String usrFollow;
    /**被关注量*/
    private String usrFollowed;

    public String getUsrFollow() {
        return usrFollow;
    }

    public void setUsrFollow(String usrFollow) {
        this.usrFollow = usrFollow;
    }

    public String getUsrFollowed() {
        return usrFollowed;
    }

    public void setUsrFollowed(String usrFollowed) {
        this.usrFollowed = usrFollowed;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrUid() {
        return usrUid;
    }

    public void setUsrUid(String usrUid) {
        this.usrUid = usrUid;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrHead() {
        return usrHead;
    }

    public void setUsrHead(String usrHead) {
        this.usrHead = usrHead;
    }

    public String getUsrGender() {
        return usrGender;
    }

    public void setUsrGender(String usrGender) {
        this.usrGender = usrGender;
    }

    public String getUsrReg() {
        return usrReg;
    }

    public void setUsrReg(String usrReg) {
        this.usrReg = usrReg;
    }

    public String getUsrProfile() {
        return usrProfile;
    }

    public void setUsrProfile(String usrProfile) {
        this.usrProfile = usrProfile;
    }

    public String getUsrEggs() {
        return usrEggs;
    }

    public void setUsrEggs(String usrEggs) {
        this.usrEggs = usrEggs;
    }

    public String getUsrStories() {
        return usrStories;
    }

    public void setUsrStories(String usrStories) {
        this.usrStories = usrStories;
    }

    public String getUsrFeelings() {
        return usrFeelings;
    }

    public void setUsrFeelings(String usrFeelings) {
        this.usrFeelings = usrFeelings;
    }
}
