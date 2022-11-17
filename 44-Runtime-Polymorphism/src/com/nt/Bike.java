package com.nt;

public class Bike {
	void run() {
		System.out.println("Bike running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("Runing safe ");
	}
	public static void main(String args[]){  
		Bike bike= new Splendor();//upcasting
		bike.run();
	}
}
