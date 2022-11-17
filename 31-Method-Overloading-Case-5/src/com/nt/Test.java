package com.nt;

public class Test {
	public void m1(int i, float f) {
		System.out.println("int -float- version");
	}

	public void m1(float f, int i) {
		System.out.println("float-int-version ");

	}

	public static void main(String[] args) {
		Test test = new Test();
		
		test.m1(10, 10.5f);// call int-float method

		test.m1(10.5f, 10);// call float-int method

		// test.m1(10, 10);//compile time error
		// test.m1(10.5f, 20.5f);//compile time error
	}
}
