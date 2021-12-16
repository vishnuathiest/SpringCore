package com.springcore.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student);
		ctx.close();
	}

}
