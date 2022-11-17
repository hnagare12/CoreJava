package com.nt;

public class Test {
	public void m1(Object o)
	{
		System.out.println("Object version");
	}
	//method overloading
public void m1( String s)
{
	System.out.println("String version");
}
public static void main(String []args) {

	Test t= new Test();
	t.m1(new Object());// call object version
	t.m1("harsh");//call String method
	t.m1(null);//indirectly call to string method
}
}
