package com.murongpurple.org.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestAopController {

    @ResponseBody
    @GetMapping("/index2")
    public Object index2(){
        System.out.println("方法2执行");
        log.info("hello murongpurple");
        return "hello murongpurple";
    }
}
