package com.gzw.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //RestController = Controller + ResponseBody
//@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    //@ResponseBody
    public String hello(){
        return "Hello World！";
    }
}
