package com.springcore.streotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/streotype/Config.xml");
		Student student = ctx.getBean("std",Student.class);
		Student student1 = ctx.getBean("std",Student.class);
		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass());
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());

	}

}
