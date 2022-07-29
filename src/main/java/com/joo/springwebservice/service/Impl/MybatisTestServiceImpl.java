package com.joo.springwebservice.service.Impl;


import com.joo.springwebservice.domain.posts.Posts;
import com.joo.springwebservice.mapper.TestMapper;
import com.joo.springwebservice.service.MybatisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MybatisTestServiceImpl implements MybatisTestService {
    private final TestMapper testMapper;

    @Override
    public List<Map<String,Object>> printTest(){
        return testMapper.printTest();
    }
}
