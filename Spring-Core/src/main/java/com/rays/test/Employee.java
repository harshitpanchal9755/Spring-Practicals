package com.rays.test;

import org.springframework.core.style.ToStringCreator;

public class Employee {
	
	private String name;
	private int salary;
	private String company;
	
	public Employee() {
		
	}
	
	public Employee(String name, String company, int salary) {
		this.name = name;
		this.company = company;
		this.salary = salary;
		
	}
	
	
	
	public String toString() { 
		return "name : "  +  name + " , " + "company : " + company  + " , " + "salary : " + salary + " ; ";
		
	}
	

}
