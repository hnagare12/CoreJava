package com.nt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(34);
		list.add(40);
		list.add(12);
		list.add(70);
		list.add(16);
		list.add(88);
		list.add(40);
		System.out.println(list);
		//find minmum or small elemnt in this list
		System.out.println("min element: "+  Collections.min(list));
	
		//find Maximum or highest elemnt in this list
		System.out.println("Maxi element :"+ Collections.max(list));
	//how meny time repeat element
		System.out.println(Collections.frequency(list, 40));
		
		 //sorting
		Collections.sort(list);
		System.out.println(list);
		
		 //sorting with reverse order
Collections.sort(list,Comparator.reverseOrder());
System.out.println(list);
	}

	}


