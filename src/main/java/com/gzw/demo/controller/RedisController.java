package com.gzw.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.gzw.demo.commonUtils.GzwJsonResult;
import com.gzw.demo.pojo.User;
import com.gzw.demo.utils.JsonUtils;
import com.gzw.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
	
	@Autowired
	private StringRedisTemplate strRedis;
	
	@Autowired
	private RedisUtils redisUtils;
	
	@RequestMapping("/test")
	public GzwJsonResult test() {

		strRedis.opsForValue().set("redis-cache2", "hello gzw~~~~~~");
		
		User user = new User();
		user.setUserName("gzw");
		user.setPassWord("123");
		user.setAddress(strRedis.opsForValue().get("redis-cache"));
		user.setAge(15);
		user.setBirthDay(new Date());

		strRedis.opsForValue().set("json:user", JSON.toJSONString(user));

		User jsonUser = JSON.parseObject(strRedis.opsForValue().get("json:user"), User.class);
		
		return GzwJsonResult.ok(jsonUser);
	}

	@RequestMapping("/getJsonList")
	public GzwJsonResult getJsonList() {
		
		User user = new User();
		user.setUserName("gzw");
		user.setPassWord("123");
		user.setAddress("北京市");
		user.setAge(15);
		user.setBirthDay(new Date());
		
		User u1 = new User();
		u1.setUserName("gzw1");
		u1.setPassWord("1231");
		u1.setAddress("北京市2");
		u1.setAge(16);
		u1.setBirthDay(new Date());
		
		User u2 = new User();
		u2.setUserName("gzw2");
		u2.setPassWord("1232");
		u2.setAddress("北京市2");
		u2.setAge(17);
		u2.setBirthDay(new Date());
		
		List<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(u1);
		userList.add(u2);

		redisUtils.set("json:info:userlist", JSON.toJSONString(userList), 2000);
		
		String userListJson = redisUtils.get("json:info:userlist");
		List<User> userListBorn = JsonUtils.jsonToList(userListJson, User.class);
		
		return GzwJsonResult.ok(userListBorn);
	}
}