package com.nt;

public interface Interf {
	public void add (int a,int b);
	default void m1() 
	{
System.out.println("Default method");
}
	static void m2() {
		System.out.println("static Method");
	}
}
	class Test{
		 public static void main(String[] args) 
		 {  
			 Interf interf=(a,b)->
				 System.out.println("The sum:"+(a+b));
				 interf.add(10,20);
				 interf.m1();
				 Interf.m2();
			 };
		 }
	
