package com.nt;

import java.util.Stack;

public class LearnStack {
	public static void main(String []args) {
		Stack<String> animal=new Stack<>();
		animal.push("Lion");
		animal.push("cat");
		animal.push("dog");
		animal.push("Elephant");
		System.out.println("Stack"+animal);
		
		//how to check 1st add 
		System.out.println(animal.peek());
		
		//delete the 1st add
		
animal.pop();
System.out.println("Stack"+animal);

		
	}

}
