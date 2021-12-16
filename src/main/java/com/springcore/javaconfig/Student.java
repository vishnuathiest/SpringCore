package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@Component("std")
public class Student {
	@Value("Abhishek")
	private String name;
	public void study()
	{
		System.out.println("Student is reading book");
	}

}
