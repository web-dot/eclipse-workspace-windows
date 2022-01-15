package com.TestPgms;

public class Op2 implements Runnable{
	int num = 20;
	public void run() {
		for(int i = 0; i < 10; i++ ) {
			if(num % 2 == 0 || num % 5 == 0) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ThreadName[" + Thread.currentThread().getName() + " ClassName: " +  this.getClass() + " : " + (int)(Math.random() * num) + "]");
			
			}
		}
		//Thread.yield();
	}
	
}
