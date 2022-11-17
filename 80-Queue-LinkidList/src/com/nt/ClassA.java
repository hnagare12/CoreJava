package com.nt;

import java.util.LinkedList;
import java.util.List;

public class ClassA {
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();
		LinkedList l2 = new LinkedList();

	//	l1.add(10); // add()===>List
		//l1.offer(20); // offer() ====>Queue
		
		l2.add(100);//Insetation order maintain
		l2.add(10);
		l2.offer(200);//Duplicate are allow
		l2.offer("java");//hetrogeneous element are allow
		l2.offer(50);//default value 0
		l2.offer(null);//null is also allow
		l2.offer(60);//not synchronizes
		l2.offer(200);
		l2.offer(30);
		System.out.println(l2);
		//first element remove write
		System.out.println(l2.poll());//100
		System.out.println(l2);
		//element remove
		System.out.println(l2.remove());//10
		System.out.println(l2);
		l2.clear();//removing all the element from the linkedList
		//System.out.println(l2);
		//System.out.println(l2.poll());//null
		//System.out.println(l2.remove());//exception error

	}
}