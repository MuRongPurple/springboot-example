package com.murongpurple.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAopController {

    @ResponseBody
    @GetMapping("/index2")
    public Object index2(){
        System.out.println("方法2执行");
        return "hello murongpurple";
    }
}
