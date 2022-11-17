package com.nt;

import java.awt.RenderingHints.Key;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
	public static void main(String[] args) {
		Map<String, Integer> number=new TreeMap<>();
		//values strore in number
		number.put("one", 1);
		number.put("two", 2);
		number.put("three", 3);
		number.put("four", 4);
		//keys unique allow 
//sorteted output always
		System.out.println(number);

	}
}
