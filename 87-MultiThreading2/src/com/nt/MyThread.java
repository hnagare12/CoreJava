package com.nt;

import java.util.Iterator;

class MyThread  extends Thread{
	 public void run()
	 {
		 //task for thread
		for( int i=10;i>=1;i--)
		{
			System.out.println("another thread="+i); 
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	 }
	 public static void main(String[] args) {
		 MyThread t=new MyThread();
		 t.start();
	}
 }
