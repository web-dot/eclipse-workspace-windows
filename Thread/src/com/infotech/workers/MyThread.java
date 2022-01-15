package com.infotech.workers;

public class MyThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "\t" + "i = " + i);
			try {
			Thread.sleep(150);
			}catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}
