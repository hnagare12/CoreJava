package com.nt;

public class TestBank {
	public static void main(String args[]){  
		
		Bank bank;
		bank=new SBI();
		System.out.println
		("Rate of Interest is: "+bank.getRateOfInterest()+" %");
	
	
	 bank=new PNB();

	System.out.println
	("Rate of Interest is: "+bank.getRateOfInterest()+"%");
}
}