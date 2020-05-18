package com.gzw.demo.mapper;

import com.gzw.demo.pojo.SpringbootdemoUser;

import java.util.List;

public interface SpringbootdemoUserMapperCustom {

    List<SpringbootdemoUser> queryUserSimplyInfoById(String id);

}
