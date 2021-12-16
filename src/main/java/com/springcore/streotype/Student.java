package com.springcore.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString@NoArgsConstructor
@Component("std")
public class Student {
	@Value("Abhishek")
	private String studentName;
	@Value("Delhi")
	private String city;
	@Value("#{address}")
	private List<String> address;

}
