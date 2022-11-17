package com.nt;

public class Test {
	public void m1(int i) {
		System.out.println("General Method");
	}

	public void m1(int... i) {
		System.out.println("Var arg method");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1(10);// call general method
		test.m1();// call var arg method
		test.m1(10, 20);// var arg method
	}
}
