package com.nt;

public class P {
	String s ="Parent variable";
}
class C extends P{
	String s ="Child Variable";
	public void m1() {
		
		System.out.println(s);//call chils variable
		
		System.out.println(this.s);//call child variable
		
		System.out.println(super.s);//call parent variable
	}
}
class Test{
	public static void main(String []args) {
		C c=new C();
		c.m1();
	}
}
