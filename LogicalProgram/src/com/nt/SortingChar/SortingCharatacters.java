package com.nt.SortingChar;

public class SortingCharatacters {
	
	public static void main(char[] args) {
		
		String str="Harshit";
	
		//Approch-1
		//without using sort method
		
		char arr[ ] =str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
	}
}
