package com.nt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		
	 Hashtable map=new Hashtable();
		map.put(101, "java");//insertion order is not  maintain 
		map.put(103, "canada");//its  synchronized 
		//map.put(102, null);//null  values are Not allows
		map.put(104, "usa");//duplicate value are allow
		//map.put(null, "uk");//null keys are not allowed
		map.put("germany", "java");///heterogenous ksys and values are allowd
		map.put(110, "chaina");//it is available to 1.4 v
		map.put(110, "paki");//duplicate keys are not allow 
		map.put(101, 500);//default capacity is 16
		map.put(112, "paki");//duplicate values are allow
		System.out.println(map);
		
		System.out.println(map.get(103));
	
	}
	
}
