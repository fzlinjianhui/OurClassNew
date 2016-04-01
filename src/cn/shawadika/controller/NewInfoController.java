package cn.shawadika.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shawadika.entity.newInfo;
import cn.shawadika.service.NewInfoService;


@Controller
@RequestMapping("")
public class NewInfoController {
	@Resource
	NewInfoService service;
	@ResponseBody
	@RequestMapping("/addNew.do")
	public String addNews(newInfo news){
		
		return service.addNews(news);
	}
	
}
