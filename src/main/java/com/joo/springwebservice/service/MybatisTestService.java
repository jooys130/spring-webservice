package com.joo.springwebservice.service;

import com.joo.springwebservice.domain.posts.Posts;

import java.util.List;
import java.util.Map;

public interface MybatisTestService {
    List<Map<String,Object>> printPost();
}
