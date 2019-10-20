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

    private String usr_id;
    private String usr_uid;
    private String usr_name;
    private String usr_head;
    private String usr_gender;
    private String usr_reg;
    private String usr_profile;
    private String usr_eggs;
    private String usr_stories;
    private String usr_feelings;

    public String getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_uid() {
        return usr_uid;
    }

    public void setUsr_uid(String usr_uid) {
        this.usr_uid = usr_uid;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_head() {
        return usr_head;
    }

    public void setUsr_head(String usr_head) {
        this.usr_head = usr_head;
    }

    public String getUsr_gender() {
        return usr_gender;
    }

    public void setUsr_gender(String usr_gender) {
        this.usr_gender = usr_gender;
    }

    public String getUsr_reg() {
        return usr_reg;
    }

    public void setUsr_reg(String usr_reg) {
        this.usr_reg = usr_reg;
    }

    public String getUsr_profile() {
        return usr_profile;
    }

    public void setUsr_profile(String usr_profile) {
        this.usr_profile = usr_profile;
    }

    public String getUsr_eggs() {
        return usr_eggs;
    }

    public void setUsr_eggs(String usr_eggs) {
        this.usr_eggs = usr_eggs;
    }

    public String getUsr_stories() {
        return usr_stories;
    }

    public void setUsr_stories(String usr_stories) {
        this.usr_stories = usr_stories;
    }

    public String getUsr_feelings() {
        return usr_feelings;
    }

    public void setUsr_feelings(String usr_feelings) {
        this.usr_feelings = usr_feelings;
    }
}
