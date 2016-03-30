package cn.shawadika.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.shawadika.dao.UserMapper;
import cn.shawadika.entity.User;

@Service
public class UserService {
	@Resource
	UserMapper userMapper;
	/*
	 * 添加用户
	 */
	public void addUser(){
	}
	/*
	 * 用户登录
	 */
	public User login(User user){
		User user2 = userMapper.login(user);
		return user2;
	}
}
