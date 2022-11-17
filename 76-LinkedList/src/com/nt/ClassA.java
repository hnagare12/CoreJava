package com.nt;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassA {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(12);//inserting order maintain
		l.add(20);////default capacity is 0
		l.add(12);//duplicate are allow
		l.add(null);//null is allow
		l.add(40);//hetergeneous elements are allow
		l.add(50);//it is not syncronise 
		l.add("java");
		l.add(60);
		System.out.println(l);
		
		System.out.println("Retriving the element using ListIterator");
ListIterator li=l.listIterator();
while(li.hasNext())
{
	System.out.println(li.next()+"    ");
}
		//reverse order
System.out.println("===Reverse order====");
while(li.hasPrevious())
{
	System.out.println(li.previous());
}
System.out.println("===================");
//first element print
System.out.println("first element:-"+l.getFirst());//12
//last
System.out.println("last element:-"+l.getLast());//60

//first add element
l.addFirst(1);
System.out.println(l);
//last add
l.addLast(100);
System.out.println(l);
//remove last
l.removeFirst();
System.out.println(l);
//remove last
l.removeLast();
System.out.println(l);

	}

}
