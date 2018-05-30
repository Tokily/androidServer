package com.chat.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chat.bean.User;
import com.chat.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestSm {
@Resource
private UserService userService=null;
@Test
public void test(){
	User user=userService.getUser("ÖÜÒã");
	System.out.println(user.getTelephone());
}
}

