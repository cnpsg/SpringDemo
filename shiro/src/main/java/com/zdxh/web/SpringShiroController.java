package com.zdxh.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringShiroController {


    @GetMapping("/index")
    public String getIndex(){
        String hello = "hello spring boot";
        return  hello;
    }

}
