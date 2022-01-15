package com.uttara.classes;

public class MyJob implements Runnable {
	
	@Override
	public void run() {
		
		try {
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
