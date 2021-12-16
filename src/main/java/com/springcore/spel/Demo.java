package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@Component("d")
public class Demo {
	@Value("#{10+502}")
	private int x;
	@Value("20")
	private int y;
	@Value("#{ T(java.lang.Math).E}")
	private double z;
	@Value("#{new String('Vishnu')}")
	private String name;
	@Value("#{8>2-5}")
	private boolean isActive;
}
