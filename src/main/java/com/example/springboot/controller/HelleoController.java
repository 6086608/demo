package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyang
 * @version 1.0.0
 * @Description TODO
 * @date 2022/03/31 20:48
 */
@RestController
public class HelleoController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "HELLO WORLD";
    }
}
