package com.imovie.mapper;

import com.imovie.bean.TestMyBatis;
import org.springframework.stereotype.Repository;

@Repository
public interface MybatisTest {
    public TestMyBatis getBatis(String age);
    public int insertOne(TestMyBatis batis);
}
