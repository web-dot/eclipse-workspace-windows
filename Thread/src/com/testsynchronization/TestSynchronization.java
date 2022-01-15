package com.testsynchronization;

public class TestSynchronization {
	public static void main(String[] args) {
		Count c = new Count();
		MyThread1 mt1 = new MyThread1(c);
		MyThread2 mt2 = new MyThread2(c);
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		
	}
	
}
