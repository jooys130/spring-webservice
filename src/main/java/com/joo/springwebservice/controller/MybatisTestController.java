package com.joo.springwebservice.controller;

import com.joo.springwebservice.service.MybatisTestService;
import com.joo.springwebservice.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class MybatisTestController {
    private final MybatisTestService testService;
    private final PersonService personService;

    @GetMapping("/printTest")
    public List<Map<String,Object>> printTest(){
        return testService.printTest();
    }

    @RequestMapping(value = "/printPerson", method = RequestMethod.GET)
    public String printPerson(Model model){
        model.addAttribute("name" , "TEST");
        model.addAttribute("result", personService.selectPersonList());
        return "printPerson";
    }

}
