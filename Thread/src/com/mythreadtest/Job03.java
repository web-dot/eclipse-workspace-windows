package com.mythreadtest;

public class Job03  implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() +  " executing Job03 run()");
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
	}
}
