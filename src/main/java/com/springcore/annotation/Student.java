package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component
@Getter@Setter@ToString
public class Student {
	@Autowired
	private Address address;
}
