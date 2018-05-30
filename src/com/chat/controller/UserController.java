package com.chat.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chat.bean.User;
import com.chat.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService service;
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping(value="/userPass",method=RequestMethod.POST,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String passLogin(String key){
		try {
			User user=service.getUser(key);
			ObjectMapper mapper=new ObjectMapper();
			String json=mapper.writeValueAsString(user);
			return json;
		}catch(Exception e) {
			System.out.println("Exception");
			return "error";
		}
	}
}
