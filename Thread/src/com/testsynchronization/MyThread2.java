package com.testsynchronization;

public class MyThread2 implements Runnable{
	Count c;
	public MyThread2(Count c){
		this.c = c;
	}
	public void run() {
		c.printTable(100);
	}
}
