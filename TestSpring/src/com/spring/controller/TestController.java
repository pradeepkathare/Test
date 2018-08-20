package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springs.pojo.Employee;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		/*
		 * Contrutor-argument so it is construtor injection
		 */
		Employee e1 = (Employee)applicationContext.getBean("e1");
		System.out.println("First Spring application : "+e1.getName()); //through construtor and it is known as constutor injection
		
		//setter injection
		System.out.println("team value through setter injection:"+e1.getTeam());
		
		e1.setId(1);
		System.out.println("singleton is default by scope : "+e1.getId());
		
		//e1 and e2 had same value
		Employee e2 = (Employee)applicationContext.getBean("e1");
		System.out.println("First Spring application : "+e2.getName() +"singleton scope : "+e2.getId());
		
		
		
	}

}
