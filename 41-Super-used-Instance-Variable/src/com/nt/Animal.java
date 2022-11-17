package com.nt;

public class Animal {
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void printColor() {
		//print color of dog class
		System.out.println(color);
		//print color of animal class
		System.out.println(super.color);

	}
}
class Test{
public static void main(String []args) {
	Dog dog =new Dog();
	dog.printColor();
}
}
