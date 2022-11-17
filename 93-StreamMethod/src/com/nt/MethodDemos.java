package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodDemos {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(70);
		list.add(30);
		list.add(50);
		list.add(20);
		System.out.println(list);
		
		
		//min
Integer minValue= list.stream().min((x,y) ->x.compareTo(y)).get();
System.out.println("min:-"+minValue);

//max
Integer maxValue=list.stream().max((x,y) ->x.compareTo(y)).get();
System.out.println("max:-"+maxValue);
//creat list also
Stream<Integer>s= Stream.of(9,99,9999,99999);
s.forEach(System.out :: println);

//or
Integer[] i= {10,20,30,40,50};
Stream.of(i).forEach(System.out :: println);


	}

}
