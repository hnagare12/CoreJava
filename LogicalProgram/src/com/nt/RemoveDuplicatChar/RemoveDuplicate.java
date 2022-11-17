package com.nt.RemoveDuplicatChar;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str="PProggramiing";
		
		//Approch-1
		
		StringBuilder builder=new StringBuilder();
		str.chars().distinct().forEach(c -> builder.append((char)c)); 
		System.out.println(builder);
		
		
		//Approch-2
		StringBuilder builder2=new StringBuilder();
		Set<Character> set  =new LinkedHashSet();
		for (int i = 0; i < builder2.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c: set) {
			builder2.append(c);
		}
		System.out.println(builder2);
	}

}  
