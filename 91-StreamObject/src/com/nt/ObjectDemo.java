package com.nt;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ObjectDemo {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(12);
		list.add(20);
		list.add(30);
		list.add(25);
		list.add(10);
		
		Stream<Integer> stream=list.stream();
		stream.forEach(e -> {
			System.out.println(e);
		}
		);
	}

}
