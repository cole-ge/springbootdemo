package com.gzw.demo.controller;

import com.gzw.demo.commonUtils.GzwJsonResult;
import com.gzw.demo.exception.GzwException;
import com.gzw.demo.pojo.Gzw;
import com.gzw.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/err")
public class ErrorController {

    @RequestMapping("/error")
    public String error(){

        int a = 1/0;

        return "thymeleaf/error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror(){


        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    public GzwJsonResult getAjaxerror(){

        int a = 1/0;

        return GzwJsonResult.ok();
    }

    @RequestMapping("/gzwexception")
    public String gzwexception() throws GzwException {
        throw new GzwException("gzw自定义异常");
    }

}
