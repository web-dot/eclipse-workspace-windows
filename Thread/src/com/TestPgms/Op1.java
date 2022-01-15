package com.TestPgms;

public class Op1 implements Runnable {
	String sa = "Hello";
	public void run() {
		for(int i = 0; i < 10; i++ ) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadName[" + Thread.currentThread().getName() + " ClassName: " +  this.getClass() + " : " + sa + "]");
		}
	}
}
