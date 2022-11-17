package com.nt;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet{
	public static void main(String[] args) {
	Set<Integer>set = new TreeSet<>();
	 set.add(32);
	 set.add(40);
	 set.add(22);
	 set.add(67);
	 set.add(40);//dublicate not allowed
	 //out put is always sorted form
	 System.out.println(set);
	 
	 set.remove(22);
	 System.out.println(set);
	 
	 //element present or not check
	 System.out.println(set.contains(67));//true
	 System.out.println(set.contains(670));//false
	 //how many element present in set
	 System.out.println(set.size());
	}
	
}
	