package com.gzw.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzw.demo.mapper.SpringbootdemoUserMapper;
import com.gzw.demo.mapper.SpringbootdemoUserMapperCustom;
import com.gzw.demo.pojo.SpringbootdemoUser;
import com.gzw.demo.service.inter.SpringbootdemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class SpringbootdemoUserServiceImpl implements SpringbootdemoUserService {

    @Autowired
    private SpringbootdemoUserMapper springbootdemoUserMapper;

    @Autowired
    private SpringbootdemoUserMapperCustom springbootdemoUserMapperCustom;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(SpringbootdemoUser user) throws Exception {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        springbootdemoUserMapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(SpringbootdemoUser user) {
        //updateByPrimaryKeySelective 只更新给定的字段，适用于只知道id，不查询出来直接修改
		springbootdemoUserMapper.updateByPrimaryKeySelective(user);
		//updateByPrimaryKey 没有设置值得会被覆盖，适用于查询出来后赋值修改
//        springbootdemoUserMapper.updateByPrimaryKey(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(String userId) {
        springbootdemoUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SpringbootdemoUser queryUserById(String userId) {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return springbootdemoUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SpringbootdemoUser> queryUserList(SpringbootdemoUser user) {

        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Example example = new Example(SpringbootdemoUser.class);
        Example.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmptyOrWhitespace(user.getUsername())) {
//			criteria.andEqualTo("username", user.getUsername());
            criteria.andLike("username", "%" + user.getUsername() + "%");
        }

        if (!StringUtils.isEmptyOrWhitespace(user.getAddress())) {
            criteria.andLike("address", "%" + user.getAddress() + "%");
        }

        List<SpringbootdemoUser> userList = springbootdemoUserMapper.selectByExample(example);

        return userList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<SpringbootdemoUser> queryUserListPaged(SpringbootdemoUser user, Integer page, Integer pageSize) {
        // 开始分页
        PageHelper.startPage(page, pageSize);

        Example example = new Example(SpringbootdemoUser.class);
        Example.Criteria criteria = example.createCriteria();
/*
        if (!StringUtils.isEmptyOrWhitespace(user.getAddress())) {
            criteria.andLike("address", "%" + user.getAddress() + "%");
        }*/
        example.orderBy("birthday").desc();
        List<SpringbootdemoUser> userList = springbootdemoUserMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(userList);

        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getTotal());

        return userList;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SpringbootdemoUser queryUserByIdCustom(String userId) {

        List<SpringbootdemoUser> userList = springbootdemoUserMapperCustom.queryUserSimplyInfoById(userId);

        if (userList != null && !userList.isEmpty()) {
            return (SpringbootdemoUser)userList.get(0);
        }

        return null;
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUserTransactional(SpringbootdemoUser user) {

        springbootdemoUserMapper.insert(user);

        int a = 1 / 0;

        user.setPassword("sssss");
        springbootdemoUserMapper.updateByPrimaryKeySelective(user);
    }
}
