package com.nt;

public class TryCatchExample {
	/*
	public static void main(String[] args) {
		try {
			int data=50/0;// may throw exception
			System.out.println("rest of the code");
		} 
		//handling the exception
		catch (ArithmeticException e)
		{
System.out.println(e);
		}
	}
}
*/
	public static void main(String[] args) {
		   try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            // handling the exception by using Exception class      
	        catch(Exception e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	}