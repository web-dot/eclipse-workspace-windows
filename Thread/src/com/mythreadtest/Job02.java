package com.mythreadtest;

public class Job02 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() +  " executing Job02 run()");
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
	}
}
