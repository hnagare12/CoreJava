package com.nt;

interface Interf {
	public void add(int a,int b);
}
class Test{
	 public static void main(String[] args) {  
		 Interf interf=(a,b) ->
		 System.out.println("The sum:"+(a+b));
		 interf.add(10, 20);
	 }
}
