package com.nt;

public class Animal {
}

class Monkey extends Animal {

}

class Test {
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		Test test = new Test();

		Animal a = new Animal();
		test.m1(a);// call animal version

		Monkey m = new Monkey();
		test.m1(m);// call monkey version

		Animal a1 = new Animal();
		test.m1(a1);// call animal version
	}
}
