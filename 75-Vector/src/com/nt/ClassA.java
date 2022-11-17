package com.nt;

import java.util.Enumeration;
import java.util.Vector;

public class ClassA {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(12);//inserting order maintain
		v.add(32);//duplicate are allow
		v.add("java");//hetergeneous elements are allow
		v.add(40);//default capacity is10(incrise size double
		v.add(50);//it is available from java 1.0
		v.add(null);//null is allow
		v.add(12);//vector is syncronise by default
		v.add(60);
		System.out.println(v);
		
		// remove method
		v.remove(1);//remove is 32 because index position 1 is 32
		System.out.println("removed:-"+v);
		//specific element remove
		v.remove((Object)40);
		System.out.println("40 removed:-"+v);
		
		System.out.println("Retriving the element vector by using Enumeration");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		//add element
		v.addElement("HTML");
		System.out.println(v);
		//null remove elements
		v.removeElement(null);
		System.out.println(v);
		//remove index 2 position
		v.removeElementAt(2);
		System.out.println(v);
		//find last element
		System.out.println(v.lastElement());//output is html
		//first element
		System.out.println(v.firstElement());//java
		
	}

}
