package com.gzw.demo.pojo;

import com.gzw.demo.commonUtils.GzwJsonResult;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

//配置该注解才会读取资源文件
@Configuration
//读取的前缀
@ConfigurationProperties(prefix = "gzw.mes")
//读取哪个资源文件
@PropertySource(value="classpath:resource.properties")
public class Gzw {

    private String name;
    private Integer age;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
