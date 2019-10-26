package com.imovie.dao;

import com.imovie.bean.MovieBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 电影信息相关数据接口
 * @author zym
 * @date 2019/10/23 20:20
 **/
@Repository
public interface MovieDAO {

    /**
     * 获取电影列表
     * @author zym
     * @date 2019/10/23 20:41
     * @param begin 起始值
     * @param limit 每次获取的数量
     * @return List<MovieBean>
     **/
    List<MovieBean> getMovies(String begin, String limit);

    /**
     * 获取某部电影相应职位的人员ID
     * @author zym
     * @date 2019/10/26 21:48
     * @param movieId 电影ID
     * @param type 人物职位
     * @return list
     **/
    List<String> getCelebrities(String movieId, String type);
}
