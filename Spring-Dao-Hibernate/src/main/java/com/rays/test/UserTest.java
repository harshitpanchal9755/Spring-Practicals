package com.rays.test;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDto;
import com.rays.service.UserService;

@Component("testUser")
public class UserTest {
	@Autowired
	UserService service;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		UserTest test = context.getBean("testUser", UserTest.class);

		test.testAdd();

	}

	private void testAdd() {

		UserDto dto = new UserDto();

		dto.setFirstName("Anurp");
		dto.setLastName("tiwari");
		dto.setLogin("anuptiwari.gmail.com");
		dto.setPassword("12345");

		service.save(dto);

	}

}
