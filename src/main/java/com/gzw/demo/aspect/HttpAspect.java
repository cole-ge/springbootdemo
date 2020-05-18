package com.gzw.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 2020-05-18
 * 测试aop记录日志
 */
@Aspect
@Component
public class HttpAspect {

    //使用的 org.slf4j.Logger，底层是logback
    public static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //切点
    @Pointcut("execution(public * com.gzw.demo.controller.*.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("请求进入controller处理前 dobefore");

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        //url
        logger.info("url={}", request.getRequestURL());
        //请求方式method
        logger.info("method={}", request.getMethod());
        //ip
        logger.info("ip={}", request.getRemoteAddr());
        //类方法
        Signature signature = joinPoint.getSignature();
        logger.info("class_method={}", signature.getDeclaringTypeName() + "." + signature.getName());
        //参数
        logger.info("args={}", joinPoint.getArgs());
    }

    //请求进入controller处理完成后 doAfter
    @After("log()")
    public void doAfter(){
        logger.info("请求进入controller处理完成后 doAfter");
    }


    @AfterReturning(returning = "returnObj", pointcut = "log()")
    public void doAfterReturning(Object returnObj){
        logger.info("返回数据后，测试获取返回数据");
        logger.info("reponse={}", returnObj);
    }
}

