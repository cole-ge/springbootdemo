package com.gzw.demo.controller;

import com.gzw.demo.commonUtils.GzwJsonResult;
import com.gzw.demo.pojo.Gzw;
import com.gzw.demo.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Gzw gzw;

    @RequestMapping("/testStr")
    public String testStr(){
        return "sss";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User("张三", "123qwe", "北京市海淀区", 22, new Date());
    }

    @RequestMapping("/A")
    public void A(){
        System.out.println("A");
        B();
    }

    public void B(){
        System.out.println("B");
    }

    @RequestMapping("/getUserJson")
    public GzwJsonResult getUserJson(){
        User user = new User("张三", "123qwe", "北京市海淀区海淀南路23232323", 22, new Date());
        return GzwJsonResult.ok(user);
    }


    @RequestMapping("/getGzw")
    public GzwJsonResult getGzw(){
        Gzw gzw1 = new Gzw();
        //需要拷贝
        BeanUtils.copyProperties(gzw, gzw1);
        //为什么 Autowired 注入的对象不能直接返回？ 代理？  大致原因是因为：Spring创建的对象是一个代理，因此在它上面还有很多其他字段与方法，而这些字段和方法不是我们定义的。
        return GzwJsonResult.ok(gzw1);
    }
}
