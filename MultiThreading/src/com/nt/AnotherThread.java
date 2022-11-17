package com.nt;

public class AnotherThread extends Thread {
	
	public void run()
	{
		//task for thread
		for (int i = 10; i>=1;i --) 
		{
		System.out.println("another thread valuue is  "+i);	
		}
	}
public static void main(String[] args) {
	AnotherThread at=new AnotherThread();
	at.start();
}
}
