package com.nt;

import java.util.HashSet;
import java.util.Iterator;

public class ClassA {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);//insertion order not maintain
		hs.add(30);//null is allow
		hs.add(20);//duplicate are not allow
		hs.add(20);//heteregenous element allow 
		hs.add("java");//default capacity is 16
		hs.add(50);//it is not synchronized
		hs.add(null);//available for 1.2 v
		hs.add(70);
		System.out.println(hs);
		
		System.out.println("Reteriving the element using Iterator");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
