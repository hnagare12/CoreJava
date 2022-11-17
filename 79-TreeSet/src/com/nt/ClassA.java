package com.nt;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassA {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(10);//insertion order  Not maintain but {sorting order is maintaib(assending)}
		ts.add(30);//available for 1.2v 
		//ts.add(20);//duplicate are not allow
		ts.add(20);//default capacity 16
		//ts.add("java");//heteregenous element not  allow 
		ts.add(50);//it is not synchronized
		//ts.add(null);//null value are not allow
		ts.add(70);
		System.out.println(ts);
		
		System.out.println("Reteriving the element using Iterator");
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
