package com.joo.springwebservice.web;

import com.joo.springwebservice.domain.posts.Posts;
import com.joo.springwebservice.service.MybatisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class MybatisTestController {
    private final MybatisTestService testService;

    @GetMapping("/printPost")
    public List<Map<String,Object>> printPost(){
        return testService.printPost();
    }


}
