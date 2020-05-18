package com.gzw.demo.controller;

import com.gzw.demo.pojo.Gzw;
import com.gzw.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("two")
public class TwoController {

	@RequestMapping("/index")
	public String index(ModelMap map) {
		Gzw gzw = new Gzw();
		gzw.setName("葛志旺22");
		map.addAttribute("gzw", gzw);
		return "thymeleaf/index";
	}

	@RequestMapping("center")
	public String center() {
		return "thymeleaf/center/center";
	}

	@RequestMapping("test")
	public String test(ModelMap map) {

		User user = new User();
		user.setAge(18);
		user.setUserName("user1");
		user.setPassWord("pwd1");
		user.setAddress("address1");
		user.setBirthDay(new Date());

		map.addAttribute("user", user);


		User u1 = new User();
		u1.setAge(18);
		u1.setUserName("user1");
		u1.setPassWord("pwd1");
		u1.setAddress("address1");
		u1.setBirthDay(new Date());

		User u2 = new User();
		u1.setAge(18);
		u1.setUserName("user1");
		u1.setPassWord("pwd1");
		u1.setAddress("address1");
		u1.setBirthDay(new Date());

		List<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(u1);
		userList.add(u2);

		map.addAttribute("userList", userList);

		return "thymeleaf/test";
	}

	@PostMapping("postform")
	public String postform(User user) {
		System.out.println(user.getUserName());
		return "redirect:/th/test";
	}
}