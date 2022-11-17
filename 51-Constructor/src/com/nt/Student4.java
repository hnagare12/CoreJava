package com.nt;

public class Student4 {
	int id;
	String name;

	// create constructor
	Student4(int i, String n) {
		this.id = i;
		this.name = n;
	}

	public static void main(String[] args) {
		Student4 s = new Student4(2, "Durga");
		System.out.println(s.id + "   " + s.name);

	}

}
