package com.nt;

public class Test {
	Test (double d)//constructor
	{
		this(10);// first line this or super
		System.out.println("double -arg constructor");
	}
  Test(int i) //constructor
  {
	  this();
	  System.out.println("int-arg-constructor");
}
  Test()
  {
	  System.out.println("no-arg-constructor");
  }
  public static void main(String []args) {
	  //Test t1=new Test(10.5);
	 // Test t2=new Test(10);
	  Test t3=new Test();
	  
  }
}

