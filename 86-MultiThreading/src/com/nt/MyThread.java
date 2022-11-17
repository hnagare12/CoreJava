package com.nt;

 class MyThread implements Runnable
{
public void run()
{
	//task for thread
	for(int i=1;i<=10;i++)
	{
		System.out.println("Value of i is: "+i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		
		}
	}
}
public static void main(String[] args) {
	//creating object in thread
	MyThread t1=new MyThread();
	Thread thread=new Thread(t1);
	thread.start();
}
}
