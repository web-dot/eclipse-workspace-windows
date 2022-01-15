package com.uttara.classes;

public class CountJob implements Runnable{
	
	Counter counter;
	
	public CountJob(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println(counter.incCount()); 
	}
	
}
