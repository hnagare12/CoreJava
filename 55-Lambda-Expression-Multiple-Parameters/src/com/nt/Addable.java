package com.nt;

interface Addable {
	int add(int a, int b);
}

class Test {
	public static void main(String[] args) {
		// multiple parameter of lambda expression
		// Lambda expression without return keyword also
		Addable ad = (a, b) -> (a + b);
		System.out.println(ad.add(10, 20));

		// multiple parameter with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));

		// lambda expression with return keyword
		Addable ad3 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad3.add(50, 50));
	}
}
