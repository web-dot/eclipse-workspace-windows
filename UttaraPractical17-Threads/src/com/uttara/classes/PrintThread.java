package com.uttara.classes;

import java.io.IOException;

public class PrintThread extends Thread{
	@Override
	public void run() {
		
		//String str = null;
		//str.length();
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