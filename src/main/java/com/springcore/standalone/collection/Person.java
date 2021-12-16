package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter@Setter@ToString@NoArgsConstructor
public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStructure;
}
