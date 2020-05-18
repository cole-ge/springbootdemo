package com.gzw.demo.controller;

import com.gzw.demo.pojo.Gzw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {

    @Autowired
    private Gzw gzw;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("gzw", gzw);
        //在配置文件中已经配置了后缀 .ftl  ，所以不需要添加后缀
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "freemarker/center/center";
    }
}
