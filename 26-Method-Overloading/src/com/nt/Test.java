package com.nt;

public class Test {
	public void m1() {
		
		System.out.println("no-arg method");
	}
	
	
public void m1(int i)
{
	
	System.out.println("int-arg method");
}
//method overload
public void m1(double d)
	{
		System.out.println("double-arg method");
	}

public static void main(String []args) {
	
	Test test = new Test();
test.m1();
test.m1(10.5d);
test.m1(10);
}
}
