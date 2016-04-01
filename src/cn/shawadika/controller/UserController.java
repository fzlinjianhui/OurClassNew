package cn.shawadika.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shawadika.entity.User;
import cn.shawadika.service.UserService;
import cn.shawadika.util.Md5Util;

@Controller
@RequestMapping("")
public class UserController {
	@Resource
	UserService userService;
	

	@ResponseBody
	@RequestMapping("/register.do")
	public void addUser(User user) {

	}

	@ResponseBody
	@RequestMapping("/loginin.do")
	public void login(HttpServletRequest request,HttpServletResponse response,User user) {
		user.setPassword(Md5Util.md5(user.getPassword() + user.getStudentNum()));
		User user2 = userService.login(user);
		try {
			if(user2==null){
				request.getSession().setAttribute("wrong", "用户名或密码错误");
				response.sendRedirect("loginin.jsp");
				return;
			}
			request.getSession().setAttribute("user", user2);
			response.sendRedirect("index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
