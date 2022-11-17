package com.nt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		map.put(101, "java");//insertion order is not maintain
		map.put(102, "canada");//heterogenous ksys and values are allowd
		map.put(103, null);//null keys and values are allows
		map.put(104, "usa");//duplicate value are allow
		map.put(null, "uk");//default capacity is 16
		map.put("germany", "java");//its not synchronized 
		map.put(110, "chaina");
		map.put(110, "paki");
		map.put(101, 500);
		System.out.println(map);
		
		System.out.println(map.get(103));
		/*
		System.out.println("Reteriving the element from the hash map");
		HashSet hs1=new HashSet(map.keySet());
		System.out.println("keys present in hash map:"+hs1);
		
		HashSet hs2=new HashSet(map.entrySet());
		System.out.println("-------------------------");
		Iterator i=hs2.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			//key and value sepret
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+"            "+e.getValue());
		}
		*/
	}

}
