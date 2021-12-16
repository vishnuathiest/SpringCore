package com.springcore.standalone.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com/springcore/standalone/collection/Myconfig.xml");
		Person person1 = ctx.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());		
		System.out.println(person1.getFeeStructure());

	}

}
