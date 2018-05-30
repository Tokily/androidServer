package com.chat.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chat.bean.User;
import com.chat.dao.UserDao;



@Service("userService")
public class UserServiceI implements UserService{
	@Resource
	private UserDao userDao;
	public User getUser(String key) {
		return this.userDao.getUser(key);
	}
}
