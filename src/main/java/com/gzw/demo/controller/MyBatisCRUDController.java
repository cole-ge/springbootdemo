package com.gzw.demo.controller;

import com.gzw.demo.commonUtils.GzwJsonResult;
import com.gzw.demo.exception.GzwException;
import com.gzw.demo.pojo.SpringbootdemoUser;
import com.gzw.demo.service.inter.SpringbootdemoUserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MyBatisCRUDController {

	@Autowired
	private SpringbootdemoUserService springbootdemoUserService;

	@Autowired
	private Sid sid;

	@RequestMapping("/saveUserValid")
	public GzwJsonResult saveUserValid(@Valid SpringbootdemoUser user1, BindingResult bindingResult) throws Exception {

		//如果校验有错误
		if (bindingResult.hasErrors()){
			System.out.println(user1.getAge());
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			throw new GzwException(bindingResult.getFieldError().getDefaultMessage());
		}

		String userId = sid.nextShort();

		SpringbootdemoUser user = new SpringbootdemoUser();
		user.setUsername(userId);
		user.setAddress("地址" + new Date());
		user.setPassword("abc123");
		user.setAge(user1.getAge());
		user.setBirthday(new Date());

		springbootdemoUserService.saveUser(user);

		return GzwJsonResult.ok("保存成功");
	}

	@RequestMapping("/saveUser")
	public GzwJsonResult saveUser() throws Exception {

		String userId = sid.nextShort();

		SpringbootdemoUser user = new SpringbootdemoUser();
		user.setUsername(userId);
		user.setAddress("地址" + new Date());
		user.setPassword("abc123");
		user.setAge((short)12);
		user.setBirthday(new Date());

		springbootdemoUserService.saveUser(user);

		return GzwJsonResult.ok("保存成功");
	}

	@RequestMapping("/updateUser")
	public GzwJsonResult updateUser() {

		SpringbootdemoUser user = new SpringbootdemoUser();
		user.setUsername("200518B07Z211AW0");
		user.setPassword("20011AW0-update");

		springbootdemoUserService.updateUser(user);

		return GzwJsonResult.ok("保存成功");
	}

	@RequestMapping("/deleteUser")
	public GzwJsonResult deleteUser(String userId) {

		springbootdemoUserService.deleteUser(userId);

		return GzwJsonResult.ok("删除成功");
	}

	@RequestMapping("/queryUserById")
	public GzwJsonResult queryUserById(String userId) {

		return GzwJsonResult.ok(springbootdemoUserService.queryUserById(userId));
	}

	@RequestMapping("/queryUserList")
	public GzwJsonResult queryUserList() {

		SpringbootdemoUser user = new SpringbootdemoUser();
		user.setPassword("abc123");
		user.setAddress("Fri");

		List<SpringbootdemoUser> userList = springbootdemoUserService.queryUserList(user);

		return GzwJsonResult.ok(userList);
	}

	@RequestMapping("/queryUserListPaged")
	public GzwJsonResult queryUserListPaged(Integer page) {

		if (page == null) {
			page = 1;
		}

		int pageSize = 10;

		SpringbootdemoUser user = new SpringbootdemoUser();

		List<SpringbootdemoUser> userList = springbootdemoUserService.queryUserListPaged(user, page, pageSize);

		return GzwJsonResult.ok(userList);
	}

	@RequestMapping("/queryUserByIdCustom")
	public GzwJsonResult queryUserByIdCustom(String userId) {

		return GzwJsonResult.ok(springbootdemoUserService.queryUserByIdCustom(userId));
	}

	@RequestMapping("/saveUserTransactional")
	public GzwJsonResult saveUserTransactional() {

//		String userId = sid.nextShort();

		SpringbootdemoUser user = new SpringbootdemoUser();
		user.setUsername("gzw123");
		user.setAddress("sdsdsadasda");
		user.setPassword("123456");
		user.setAge((short)19);

		user.setBirthday(new Date());
		springbootdemoUserService.saveUserTransactional(user);

		return GzwJsonResult.ok("保存成功");
	}
}
