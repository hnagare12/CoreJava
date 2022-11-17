package com.nt;

public class Bike {
	final void run() {
		System.out.println("bike runing");
	}
}
class Honda extends Bike{
	   public static void main(String args[]){  
		 Honda honda=  new Honda();
		 honda.run();
	   }
}
