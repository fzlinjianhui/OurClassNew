package cn.shawadika.service;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.shawadika.dao.newInfoMapper;
import cn.shawadika.entity.newInfo;

@Service
public class NewInfoService {
	
	@Resource
	newInfoMapper info;
	
	public String addNews(newInfo news){
		System.out.println("service:+....."+news.toString());
		if(news!=null){
			news.setId(UUID.randomUUID().toString());
			news.setTime(System.currentTimeMillis());
			news.setUserId("000001");
			info.addNew(news);
			return "添加成功";
		}else{
			return "添加失败";
		}
	}
}
