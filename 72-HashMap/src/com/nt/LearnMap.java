package com.nt;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	private static final int HashMap = 0;

	public static void main(String[] args) {
Map<String, Integer>number= new HashMap<>();
//values strore in number
number.put("one", 1);
number.put("two", 2);
number.put("three", 3);
number.put("four", 4);
//keys unique allow 

System.out.println(number);
//value present or not check
System.out.println(number.containsValue(2));
	}

}
