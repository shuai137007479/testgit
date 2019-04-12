package com.wxl.testmybatis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wxl.testmybatis.mapper.UserMapper;
import com.wxl.testmybatis.pojo.User;

@RestController
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getUser")
	public List<User> getAll(){
		List<User> users=userMapper.getAll();
		return users;
	}
	
	@RequestMapping("/getOne")
	public User getOne(Long id) {
		User user=userMapper.getOne(id);
		return user;
	}
		
	@RequestMapping("/add")
	public String add(User user) {
		System.out.println(userMapper.save(user));
		return "save";
	}
	
	@RequestMapping("/update")
	public String update(User user) {
		System.out.println(userMapper.update(user));
		return "update";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id) {
		System.out.println(userMapper.delete(id));
		return "delete";
	}
}
