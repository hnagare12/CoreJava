package com.TwoThreadRun;

public class MyThread implements Runnable {
	public void run()
	// method body
	{
		// task for threads
		for (int i = 1; i <= 10; i++) {
			System.out.println("value of i is     " + i);
			// 1sec brak and print
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {

		// create object of MyThread Class
		MyThread mt = new MyThread();
		Thread thr = new Thread(mt);
		
		//object of AnotherThread
		AnotherThread at=new AnotherThread();
		at.start();
		thr.start();//object of MyThread
	}
}
