package com.TwoThreadRun;

public class AnotherThread extends Thread {

	public void run() {
		// task for thread
		for (int i = 10; i >= 1; i--) {
			System.out.println("another thread valuue is  " + i);
			// 1sec brak and print
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
