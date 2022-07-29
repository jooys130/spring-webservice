package com.joo.springwebservice.service;


import java.util.List;

import com.joo.springwebservice.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public List selectPersonList(){
        return personMapper.selectPersonList();
    }

}