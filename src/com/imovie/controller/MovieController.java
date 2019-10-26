package com.imovie.controller;

import com.imovie.bean.MovieBean;
import com.imovie.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zym
 * @version 1.0
 * @classname MovieController
 * @description
 * @date 2019/10/26 21:59
 **/
@Controller
public class MovieController {
    @ResponseBody
    @RequestMapping(value = "/movie/browse")
    public List<MovieBean> getMovies(@RequestParam String begin, @RequestParam String offset) {
        return new ArrayList<>(MovieService.getMovies(begin, offset).values());
    }
}
