package com.threads.basic;

public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;
	RunnableDemo(String name){
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}
	//override run
	@Override
	public void run() {
		System.out.println("Running thread: " + threadName);
		try {
		for(int i = 4; i > 0; i--) {
			System.out.println("Thread: " + threadName + " , " + i);
			//let the thread sleep for a while
			Thread.sleep(50);
		}
		}catch(InterruptedException e) {e.printStackTrace();}
	}
}
