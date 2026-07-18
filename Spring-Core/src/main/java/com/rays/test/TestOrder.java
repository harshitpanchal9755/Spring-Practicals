package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rays.icon.Order;

public class TestOrder {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory( new ClassPathResource("order.xml"));
		
		Order order = (Order) factory.getBean("order");
		
		order.order(10);
		
		
	}

	
}
