package com.nt;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(12);
		al.add("ram");
		al.add(12);//dublicate are allowed
		al.add(20);
		al.add(30);
		System.out.println(al);
		//size method
		System.out.println(al.size());
		// 3rd positin element
		System.out.println(al.get(3));
		
		//retriveing the element by using for loop
		System.out.println("retriving the element by using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//revese order retrive
		System.out.println("====reverse-order====");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		//retrive for each loop
		System.out.println("=retriving the element by using for each loop=");
for(Object o:al)
{
	System.out.println(o);
}
//pericular position add element
System.out.println("----------------------");
System.out.println(al);
al.add(1,100);
System.out.println(al);
//remove 20
System.out.println(al);
al.remove(4);
System.out.println("Removed:-"+al);

System.out.println("==>retriving using Iterator Interface");
Iterator i=al.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}


	}
}
