package com.example.demo;


abstract class Bike {
	abstract void run();
}

class Honda4 extends Bike{
	void run(){
		System.out.println("running saf");
	}

}
