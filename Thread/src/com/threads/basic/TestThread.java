package com.threads.basic;

public class TestThread {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		Thread t1 = new Thread(r1);
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread-2");
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
