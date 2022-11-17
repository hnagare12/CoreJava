package com.nt;

import java.util.ArrayList;
import java.util.List;

public class Number {
	public static void main(String args[]){ 
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
	/*	//print all numberls
		System.out.println(list);
		
		//remove 20
		list.remove(1);//removing process with the help of index
		System.out.println(list);
		
		//specific value delete
		list.remove(Integer.valueOf(30));
		System.out.println(list);
		
		//clear all list
		//list.clear();
		//System.out.println(list);
		 
		 */
		
		// set value means value update
		//index start o,1,2like this now value change 30 to 3000
		System.out.println(list);
		list.set(2, 3000);
		System.out.println(list);
		
		//element check number present or not ans is true or false
		System.out.println(list.contains(40));
		
		
		
	}
}