package com.nt;

import java.io.IOException;

public class TestThrow {
	 void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  
		}  
		class Testthrows3{  
		   public static void main(String args[])throws IOException{//declare exception  
		    
			   TestThrow tt= new TestThrow();
			   tt.method();  
		  
		    System.out.println("normal flow...");  
		  }  
		}  