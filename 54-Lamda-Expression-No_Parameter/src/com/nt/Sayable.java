package com.nt;

public interface Sayable {
	public String say();
}

class Test{
	public static void main(String []args) {
		Sayable sayable=( ) -> {
			return"I have nothing to say";
		};
		System.out.println(sayable.say());
	}
}
