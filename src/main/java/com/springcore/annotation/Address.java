package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@Component
public class Address {
	@Value("Abhishek")
	private String name;
	@Value("28")
	private int age;
	@Value("Banglore")
	private String address;
	@Value("Vishnuathiest")
	private String instaId;
}
