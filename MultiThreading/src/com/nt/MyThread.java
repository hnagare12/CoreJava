package com.nt;
public class MyThread  implements  Runnable 
{
	public void run() 
	//method body
	{
	//task for threads
		for (int i = 1; i <=10; i++)
		{
				System.out.println("value of i is     "+i);
		}
	}	
	public static void  main (String[]args) {
		
		//create object of MyThread Class
		MyThread mt=new MyThread();
		Thread thr=new Thread(mt);
		thr.start();
	}
}
	 