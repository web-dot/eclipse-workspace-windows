package com.uttara.classes;

public class Counter {
	
	private int count;
	
	public synchronized int incCount() {
		++count;
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return count;
	}
}
