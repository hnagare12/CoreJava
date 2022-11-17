package com.nt;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("A");
	a.add("B");
	a.add(2);
	a.add("d");
	a.add(null);
	System.out.println(a);//[A,B,2,null]
	a.remove(3);
	System.out.println(a);//[A,B,2,null]
	a.add(3,"E");
	a.add("N");
	System.out.println(a);//[A,B,2,E,null,N]
	
	
	
	
	}

}
;