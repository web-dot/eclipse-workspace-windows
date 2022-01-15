package com.TestPgms;

public class TestThreads {

	public static void main(String[] args) {
		TestThread1 ts1 = new TestThread1(56);
		TestThread2 ts2 = new TestThread2("sudip");
		
		Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts2);
		
		//t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		
		//t1.yield();

	}

}
