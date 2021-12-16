package com.nt.abhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Student std = ctx.getBean("std",Student.class);
		System.out.println(std);
	}

}
