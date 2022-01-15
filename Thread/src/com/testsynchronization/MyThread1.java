package com.testsynchronization;

public class MyThread1 implements Runnable {
	Count c;
	public MyThread1(Count c) {
		this.c = c;
	}
	public void run() {
		c.printTable(5);
	}
}
