package com.infotech.client;
import com.infotech.workers.*;
public class Test {

	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r, "T2");
		Thread t3 = new Thread(r, "T3");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
