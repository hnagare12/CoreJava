package com.nt;

public class Test {
	public void m1(String s) {
		System.out.println("String version");
	}

	public void m1(StringBuffer sb) {
		System.out.println(" String Buffer version");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1("Durgaa");// call String method

		test.m1(new StringBuffer("Harsh"));// Call String buffer
//test.m1(null);//compile time error

	}
}
