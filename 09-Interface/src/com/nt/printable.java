package com.nt;

 interface printable {
	 void print();
}
 class A6 implements printable{
	 public void print() {
		 System.out.println("Hello");
	 }
		public static void main(String args[]){  
			A6 a6= new A6();
			a6.print();
		}
 }
