package com.nt;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	public static void main(String args[]){ 
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.add(5);
		//this add end of the list
		System.out.println(list);
		
		list.add(1, 50);
		//this is print to 1 side 50 after 2 print
		System.out.println(list);
		
		//Adding new least to old list
	ArrayList<Integer>newList=new ArrayList<>();
		newList.add(150);
		newList.add(160);
		//adding 
		newList.addAll(newList);
		//print
		System.out.println(list);
	}

}
