package com.imovie.service;

import com.imovie.bean.MovieBean;
import com.imovie.dao.MovieDAO;
import com.imovie.util.SpringBeanUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zym
 * @version 1.0
 * @classname MovieService
 * @description
 * @date 2019/10/26 21:49
 **/
@Service
public class MovieService {
    private static final Logger LOGGER = LogManager.getLogger(MovieService.class);
    private static final MovieDAO MOVIE_DAO = SpringBeanUtil.getContext().getBean(MovieDAO.class);

    /**
     * 获取电影信息列表
     * @author zym
     * @date 2019/10/26 21:52
     * @param begin 起始值
     * @param offset 步长
     * @return Map<String, MovieBean>
     **/
    public static Map<String, MovieBean> getMovies(String begin, String offset) {
        Map<String, MovieBean> movieBeanMap = new LinkedHashMap<>();
        List<MovieBean> movieBeanList = MOVIE_DAO.getMovies(begin, offset);

        for (MovieBean movieBean : movieBeanList) {
            String movieId = movieBean.getMovieId();
            movieBean.setMovieDirectors(MOVIE_DAO.getCelebrities(movieId, "0"));
            movieBean.setMovieWriters(MOVIE_DAO.getCelebrities(movieId, "1"));
            movieBean.setMovieActors(MOVIE_DAO.getCelebrities(movieId, "2"));
            movieBeanMap.put(movieId, movieBean);
        }

        LOGGER.info("movieList's size is [" + movieBeanList.size() + "]");
        return movieBeanMap;
    }
}
