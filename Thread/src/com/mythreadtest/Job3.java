package com.mythreadtest;

public class Job3  implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() +  " executing Job03 run()");
	}
}
