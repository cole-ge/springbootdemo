package com.gzw.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {

    private String userName;

    //忽略返回该字段
    @JsonIgnore
    private String passWord;

    //非空才返回
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;

    private Integer age;

    //返回时格式化
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="zh", timezone="GMT+8")
    private Date birthDay;


    public String getUserName() {
        return userName;
    }

    public User() {

    }

    public User(String userName, String passWord, String address, Integer age, Date birthDay) {
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.age = age;
        this.birthDay = birthDay;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }
}
