package com.nt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		
		LinkedHashMap map=new LinkedHashMap();
		map.put(101, "java");//insertion order is maintain
		map.put(102, "canada");//heterogenous ksys and values are allowd
		map.put(103, null);//null keys and values are allows
		map.put(104, "usa");//duplicate value are allow
		map.put(null, "uk");//default capacity is 16
		map.put("germany", "java");//its not synchronized 
		map.put(110, "chaina");//it is available to 1.4 v
		map.put(110, "paki");
		map.put(101, 500);
		System.out.println(map);
		
		System.out.println(map.get(103));
	
	}

}
