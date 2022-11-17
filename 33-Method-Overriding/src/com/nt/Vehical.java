package com.nt;

//parent Class
public class Vehical {
	void run() {
		System.out.println("vehical is runing");
	}
}

//create child class
class Bike extends Vehical {
	public static void main(String args[]) {
		// create an instance in child class
		Bike bike = new Bike();

		// calling method with child class instance
		bike.run();
	}

}
