package com.op;

public class UserThread extends  Thread{
	public void run()
	{
		//task for thread 
		System.out.println("");
	}
}

class ThreadOp
{
	public static void main(String[] args) {
		System.out.println("Program started.....");
		int x=56+34;
		System.out.println("sum is "+x);
		//Thread....
		Thread t= Thread.currentThread();
		String tname=t.getName();
		System.out.println("current running thread is  "+tname);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		};
		System.out.println(tname.getId());
		System.out.println("program ended...");
		
	}
}
