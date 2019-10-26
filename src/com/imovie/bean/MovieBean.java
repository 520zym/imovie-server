package com.imovie.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zym
 * @ClassName: MovieBean
 * @Description: 电影的基本信息
 * @Date: 2019/10/20 17:39
 * @Version: 1.0
 **/
@Component
public class MovieBean implements Serializable {
    private static final long serialVersionUID = 8023831350401414978L;

    /**电影唯一标识*/
    private String movieId;
    /**电影名称*/
    private String movieName;
    /**电影海报*/
    private String movieImage;
    /**电影类型*/
    private String movieType;
    /**拍摄国家地区*/
    private String movieCountry;
    /**语言*/
    private String movieLanguage;
    /**上映日期*/
    private String movieDate;
    /**集数？？ defaultValue = 1*/
    private String movieCount;
    /**电影时长*/
    private String movieTime;
    /**电影别名*/
    private String movieAlias;
    /**电影简介*/
    private String movieProfile;
    /**电影下彩蛋数*/
    private String movieEgg;
    /**电影下故事数量*/
    private String movieStory;
    /**电影下观后感数量*/
    private String movieFeeling;
    /**电影热度值*/
    private String movieReputation;
    /**电影导演*/
    private List<String> movieDirectors;
    /**电影编剧*/
    private List<String> movieWriters;
    /**主演*/
    private List<String> movieActors;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public List<String> getMovieDirectors() {
        return movieDirectors;
    }

    public void setMovieDirectors(List<String> movieDirectors) {
        this.movieDirectors = movieDirectors;
    }

    public List<String> getMovieWriters() {
        return movieWriters;
    }

    public void setMovieWriters(List<String> movieWriters) {
        this.movieWriters = movieWriters;
    }

    public List<String> getMovieActors() {
        return movieActors;
    }

    public void setMovieActors(List<String> movieActors) {
        this.movieActors = movieActors;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getMovieCountry() {
        return movieCountry;
    }

    public void setMovieCountry(String movieCountry) {
        this.movieCountry = movieCountry;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(String movieCount) {
        this.movieCount = movieCount;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieAlias() {
        return movieAlias;
    }

    public void setMovieAlias(String movieAlias) {
        this.movieAlias = movieAlias;
    }

    public String getMovieProfile() {
        return movieProfile;
    }

    public void setMovieProfile(String movieProfile) {
        this.movieProfile = movieProfile;
    }

    public String getMovieEgg() {
        return movieEgg;
    }

    public void setMovieEgg(String movieEgg) {
        this.movieEgg = movieEgg;
    }

    public String getMovieStory() {
        return movieStory;
    }

    public void setMovieStory(String movieStory) {
        this.movieStory = movieStory;
    }

    public String getMovieFeeling() {
        return movieFeeling;
    }

    public void setMovieFeeling(String movieFeeling) {
        this.movieFeeling = movieFeeling;
    }

    public String getMovieReputation() {
        return movieReputation;
    }

    public void setMovieReputation(String movieReputation) {
        this.movieReputation = movieReputation;
    }
}
