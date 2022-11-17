package com.nt.RemoveAllWhiteSpaces;

public class Test {
	
	public static void main(String[] args) {
		String str="H         a  r s  h     it";
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
