package com.nt;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void sleep() {
		System.out.println("weeping...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		BabyDog babyDog = new BabyDog();
		babyDog.sleep();
		babyDog.bark();
		babyDog.eat();
	}
}
