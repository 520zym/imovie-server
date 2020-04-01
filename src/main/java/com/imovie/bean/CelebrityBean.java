package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zym
 * @version 1.0
 * @classname CelebrityBean
 * @description
 * @date 2019/10/26 21:27
 **/
@Component
public class CelebrityBean implements Serializable {
    private static final long serialVersionUID = 4044172045829404795L;

    /**人员ID*/
    private String celebrityId;
    /**人员姓名*/
    private String celebrityName;
    /**人员性别*/
    private String celebrityGender;
    /**人员生日*/
    private String celebrityBirthday;
    /**人员国籍*/
    private String celebrityCountry;
    /**人员简介*/
    private String celebrityProfile;
    /**人员代表作*/
    private String celebrityMaster;
    /**人员图片*/
    private String celebrityImage;

    public String getCelebrityId() {
        return celebrityId;
    }

    public void setCelebrityId(String celebrityId) {
        this.celebrityId = celebrityId;
    }

    public String getCelebrityName() {
        return celebrityName;
    }

    public void setCelebrityName(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    public String getCelebrityGender() {
        return celebrityGender;
    }

    public void setCelebrityGender(String celebrityGender) {
        this.celebrityGender = celebrityGender;
    }

    public String getCelebrityBirthday() {
        return celebrityBirthday;
    }

    public void setCelebrityBirthday(String celebrityBirthday) {
        this.celebrityBirthday = celebrityBirthday;
    }

    public String getCelebrityCountry() {
        return celebrityCountry;
    }

    public void setCelebrityCountry(String celebrityCountry) {
        this.celebrityCountry = celebrityCountry;
    }

    public String getCelebrityProfile() {
        return celebrityProfile;
    }

    public void setCelebrityProfile(String celebrityProfile) {
        this.celebrityProfile = celebrityProfile;
    }

    public String getCelebrityMaster() {
        return celebrityMaster;
    }

    public void setCelebrityMaster(String celebrityMaster) {
        this.celebrityMaster = celebrityMaster;
    }

    public String getCelebrityImage() {
        return celebrityImage;
    }

    public void setCelebrityImage(String celebrityImage) {
        this.celebrityImage = celebrityImage;
    }
}
