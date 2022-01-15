package com.TestPgms;

public class TestThread1 implements Runnable {
	int num;
	public TestThread1(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			/*
			try {
				Thread.sleep(300);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}*/
			System.out.println(num);
		}
	}
}
