package com.uttara.classes;

public class MyJobValue implements Runnable {
	
	int val;
	
	public MyJobValue(int val){
		this.val = val;
	}
	
	@Override
	public void run() {
		for(int i=val; i<val+100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
