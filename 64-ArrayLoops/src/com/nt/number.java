package com.nt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class number {
	public static void main(String args[]){ 
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println(list);
		
		//print all number in verticle form
		for (int i = 0; i < list.size(); i++) {
			System.out.println("the elementis"+list.get(i));
			//or
			for(Integer element:list) {
				System.out.println("foreEach element"+element);
				//or
				Iterator<Integer>iterator=list.iterator();
				while(iterator.hasNext()) {
					System.out.println("Iterator"+iterator.next());
				}
				
			}
		}
		
	}

}
