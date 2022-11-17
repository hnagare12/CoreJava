package com.nt;

import java.io.ObjectInputStream.GetField;

public class TestEncapsulation {
	public static void main(String[] args) {  

		//creating instance of Account class
		Account acc = new Account();
		
		// set the value of setter method
		acc.setAcc_no(2626266262L);
		acc.setName("Harsh");
		acc.setEmail("harsh12@gmail.com");
		acc.setAmount(46666f);
		
		//get the value of getter method
		System.out.println(acc.getAcc_no()+"  "+acc.getName()+"  "+acc.getEmail()+"  "+acc.getAmount()+"  ");
	}
}
