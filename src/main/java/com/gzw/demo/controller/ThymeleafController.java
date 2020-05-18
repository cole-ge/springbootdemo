package com.gzw.demo.controller;

import com.gzw.demo.pojo.Gzw;
import com.gzw.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/th")
public class ThymeleafController {

    @Autowired
    private Gzw gzw;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("gzw", gzw);
        //在配置文件中已经配置了后缀 .html  ，所以不需要添加后缀
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "thymeleaf/center/center";
    }

    @RequestMapping("/test")
    public String test(ModelMap map){
        User user = new User("superadmin","123123","<font color=\"red\"><b>hello 葛志旺</b></font>", 22, new Date());
        map.addAttribute("user", user);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(new User("张三","123123","<font color=\"red\"><b>hello 张三</b></font>", 16, new Date()));
        userList.add(new User("李四","123123","<font color=\"red\"><b>hello 李四</b></font>", 18, new Date()));
        userList.add(new User("王五","123123","<font color=\"red\"><b>hello 王五</b></font>", 20, new Date()));
        userList.add(new User("赵六","123123","<font color=\"red\"><b>hello 赵六</b></font>", 26, new Date()));

        map.addAttribute("userList", userList);

        return "thymeleaf/test";
    }

    @RequestMapping("/postform")
    public String postform(User u){
        System.out.println(u);
        return "redirect:/th/test";
    }
}
