package com.nt;

public class Bank {
	float getRateOfIntrest()
	{
	return 0;	
	}
}
class SBI extends Bank{
	float getRateOfIntrest()
	{
		return 7.2f;
	}
}
class AXIS extends Bank{
	float getRateOfIntrest()
	{
		return 8.0f;
	}
}
class ICICI extends Bank{
	float getRateOfIntrest()
	{
		return 9.1f;
	}
}
class Test{
	public static void main(String args[]){  
		Bank bank;
		bank=new SBI();
		System.out.println("SBI rate of intrest:"+bank.getRateOfIntrest());
	
		bank=new AXIS();
	System.out.println("AXIS rate of intrest:"+bank.getRateOfIntrest());
	
	bank= new  ICICI();
	System.out.println("ICICI rate of intrest:"+ bank.getRateOfIntrest());
	}
}
