package com.xiao.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dream on 17/12/10.
 */
@Controller
@RequestMapping("/x")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
