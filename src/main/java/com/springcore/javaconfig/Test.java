package com.springcore.javaconfig;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.class);
		Student std = ctx.getBean("std",Student.class);
		System.out.println(std);
		std.study();
		ctx.close();
	}

}
