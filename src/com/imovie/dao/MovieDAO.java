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
}
