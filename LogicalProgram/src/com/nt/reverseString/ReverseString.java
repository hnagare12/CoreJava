package com.nt.reverseString;


public class ReverseString {
	
	public static void main(String[] args) {
		String str="hello";
		
		//Approch-1
		char[] chArr=str.toCharArray();
		for(int i=chArr.length -1; i>=0;i--) {
		//System.out.println(chArr[i]); 
		//one line olleh print
		System.out.print(chArr[i]);
	}
		
		System.out.println("");
		
		//Approch-2
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	System.out.println("");
	
	//Approch-3
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
}
	
}