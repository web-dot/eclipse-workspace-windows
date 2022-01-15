package com.TestPgms;

public class TestThread2 implements Runnable {
	String name;
	public TestThread2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			Thread.yield();
			/*
			try {
				Thread.sleep(400);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}*/
			System.out.println(name);
		}
	}
}
