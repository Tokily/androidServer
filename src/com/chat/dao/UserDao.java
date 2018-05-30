package com.chat.dao;


import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.chat.bean.User;


@Repository("userDao")
public class UserDao {
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	public User getUser(String key){
		User user=sqlSessionTemplate.selectOne("com.chat.mapper.userMapper.getUser",key);
		return user;
	}
}
