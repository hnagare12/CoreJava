package com.nt;

//create parent class
public class Vehical {
	
	//define method
	void run()
	{
		System.out.println("Vehicle is runing");
	}
}
//create child class
class Bike  extends Vehical{
	
	//define same method as the parent class
	
	void run()
	{
		System.out.println("Bike is runing");
	}

public static void main(String args[]){ 
	
	Bike bike=new Bike();//create object
	bike.run();//calling method child class method is runing
	
}
}