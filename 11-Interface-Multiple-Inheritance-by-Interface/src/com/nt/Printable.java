package com.nt;

 interface Printable {
	void print();
}
interface Showable{
	void print();
}

class TestInterface implements Printable,Showable{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static void main(String args[]){  
		TestInterface interface1=new TestInterface();
		interface1.print();
	}
	
}