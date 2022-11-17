package com.nt;

public class Exam {
	 public static void main(String[] args) {  
		 //thread example without lambda
		 Runnable r=new Runnable() {
			 public void run() {
				 System.out.println("Thread is running");
			 }
		 };
		 Thread t=new Thread(r);
		 t.start();
		 
		 //thread example with lambda
		 Runnable r2 =()->{
			 System.out.println("Thread 2 is running");
		 };
		 Thread t2=new Thread(r2);
		 t2.start();
	 }

}
