package com.nt;

//where three classes are overriding of the parent class
//parent class
public class Bink {
	int getRateOfIntrest()
	{
		return 0;
	}
}
//create child class
 class SBI extends Bink{
	 int getRateOfIntrest()
	 {
		 return 8;
	 }
 }
 //second child class
 class ICIC extends Bink{
	 int getRateOfIntrest()
	 {
		 return 9;
	 }
 }
 //third child class
 class AXIS extends Bink{
	 int getRateOfIntrest()
	 {
		 return 7;
	 }
 }
 //Create Test Class create object and call method
 class Test{
	 public static void main(String args[]){ 
		 SBI sbi =new SBI();
		 System.out.println("SBI Rate of Interest: "+sbi.getRateOfIntrest());  //calling method

		 ICIC icic= new ICIC();
		 System.out.println("ICICI Rate of Interest: "+icic.getRateOfIntrest());

		 AXIS axis= new AXIS();
		 System.out.println("AXISRate of Interest: "+axis.getRateOfIntrest());  
	 }
 }