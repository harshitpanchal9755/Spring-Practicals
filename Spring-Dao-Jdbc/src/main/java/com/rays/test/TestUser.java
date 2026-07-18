package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDto;
import com.rays.service.UserService;

@Component("testUser")
public class TestUser {

	@Autowired
	UserService service;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUser test = context.getBean("testUser", TestUser.class);

		test.testAdd();
	}

	private void testAdd() {
		UserDto dto = new UserDto();

		dto.setId(1);
		dto.setFirstName("anuroop");
		dto.setLastName("patidar");
		dto.setLogin("anurooppatidat.com");
		dto.setPassword("pass123");

		int id = service.add(dto);

		System.out.println("add is successsfull" + id);

	}

}
