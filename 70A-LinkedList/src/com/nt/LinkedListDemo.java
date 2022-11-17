package com.nt;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("Durga");
		list.add(30);
		list.add(null);
		list.add(0,"Soft");
		list.removeLast();
		list.addFirst("CCC");
		list.addLast("ram");
		System.out.println(list);
	}

}
