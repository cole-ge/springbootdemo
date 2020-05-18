package com.gzw.demo.tasks;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * gezhiwang 20200516
 * 项目启动成功后在执行的任务类
 */
@Component
public class RunAfterServerRunning implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("项目启动完成，开始执行初始化任务");
        System.out.println("执行由于分布式部署限定定时任务只执行一次的配置初始化...");
        System.out.println("。。。");

    }
}
