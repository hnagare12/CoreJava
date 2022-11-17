package com.nt;

public class Test {
	public void m1() {
		
		System.out.println("no-arg method");	
	}
 public void m1(int i) {
	 System.out.println("int arg method");
 }
 //method overload
 public void m1(float f)
 {
	 System.out.println("float arg method");
 }
 public static void main(String []args) {
	 Test t = new Test();
	 
	 t.m1(10);//int arg call 
	 t.m1(10.5f);
	 t.m1(0);
	// t.m1(10.5);//compile time error
 }
}
