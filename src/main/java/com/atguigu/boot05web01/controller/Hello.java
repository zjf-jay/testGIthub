package com.atguigu.boot05web01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjf
 * @date 2022/1/21 - 17:21
 */
@Controller
public class Hello {
    @GetMapping("/aa")
    @ResponseBody
    public String aa(){
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("aa");
        return "Hello, Spring Boot 2!";
    }

    @GetMapping("/bb")
    public String bb(){
        return "bb";
    }
}
