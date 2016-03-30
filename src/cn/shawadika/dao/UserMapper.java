package cn.shawadika.dao;

import cn.shawadika.entity.User;

public interface UserMapper {
	//添加用户
	public void addUser(User user);
	//用户登录
	public User login(User user);
}
