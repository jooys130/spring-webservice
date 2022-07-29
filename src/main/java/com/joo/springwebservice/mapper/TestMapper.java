package com.joo.springwebservice.mapper;

import com.joo.springwebservice.domain.posts.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TestMapper {
    List<Map<String,Object>> printTest();
}
