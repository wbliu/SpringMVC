package com.lwb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwb.springmvc.model.Person;

@Controller	
@RequestMapping("/json")
public class jsonController {

//  十三、返回json格式的字符串
    @ResponseBody
    @RequestMapping("/user")
    public  Person get(){
    	Person u = new Person();
        u.setName("jayjay");
        return u;
    }
}