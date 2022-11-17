package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(32);
		list.add(40);
		list.add(50);
		list.add(13);
		list.add(63);
		// using stream
		/*
		 * Stream<Integer> li=list.stream(); List<Integer> newList=li.filter(i -> i % 2
		 * == 0).collect(Collectors.toList()); System.out.println(newList);
		 */

		// create list and filter all even number
		// using stream
		List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
	}

}
