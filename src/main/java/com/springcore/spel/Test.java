package com.springcore.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/spel/Myconfig.xml");
		Demo d = ctx.getBean("d",Demo.class);
		System.out.println(d);
		ctx.close();
	}

}
