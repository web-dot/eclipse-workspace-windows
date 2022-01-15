package com.uttara.resource;

public class Counter {

	private int count;
	
	public synchronized int incCount()
	{
		++count;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}
