package com.nt;

public class A {
	//create method
	A get()
	{
		return this;
	}
}
class B extends A{
	@Override
	B get()
	{
		return this;
	}
	void message()
	{
		System.out.println("welcome to coverient type");
	}
	public static void main(String args[]){ 
new B().get().message();
}
}
