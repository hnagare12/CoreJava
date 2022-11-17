package com.nt.RemoveSpecialChar;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String str="@ak!E$h%y&*";
		
		//Approch-1(replaceAll() method)
		
		String plainStr=str.replaceAll("[^a-zA-Z0-9]",""); 
		System.out.println(plainStr);
	}
}
