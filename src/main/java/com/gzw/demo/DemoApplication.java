package com.gzw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//配置扫描mybatis mapper包路径   tk.mybatis.spring.annotation.MapperScan
@MapperScan(basePackages = "com.gzw.demo.mapper")
//扫描所有需要的包， 包含一些其他自用的工具类包所在的路径
@ComponentScan(basePackages = {"com.gzw.demo", "org.n3r.idworker"})
//开启定时开关
//@EnableScheduling
//开启异步调用方法
//@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
