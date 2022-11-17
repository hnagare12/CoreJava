package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodDemo {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("raju");
		name.add("Abhi");
		name.add("Amay");
		name.add("Aman");
		// filter method
		List<String> newName = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newName);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(20);
		list.add(4);
		list.add(2);
		list.add(5);

		// Map method
		List<Integer> newNumber = list.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(newNumber);
		
		// sorted
		list.stream().sorted().forEach(e -> {
			System.out.println(e);
		});
		
		//min
		Integer inte=list.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println("Min:-"+inte);
		
		//Maximum
		Integer inte1=list.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("Max:-"+inte1);
		
		ArrayList<Integer>mark=new ArrayList<>();
		mark.add(10);
		mark.add(65);
		mark.add(50);
		mark.add(75);
		mark.add(20);
		
		//map method
		System.out.println(mark);
		List<Integer>updateMark=mark.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateMark);
		
		//count method
		//student fail count
		System.out.println(mark);
		long noOfFailedStudents= mark.stream().filter(m-> m<35).count();
		System.out.println(noOfFailedStudents);
		
		//sorted method
		System.out.println(mark);
		List<Integer>sortedList=mark.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted:-"+sortedList);
		
		
	}}