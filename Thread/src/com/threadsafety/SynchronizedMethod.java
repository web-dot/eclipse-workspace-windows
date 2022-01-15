package com.threadsafety;
import java.util.Arrays;

public class SynchronizedMethod {
	public static void main(String[] args) {
		String[] arr = {"1", "2", "3", "4", "5", "6"};
		
		try {
		HashMapProcessor hmp = new HashMapProcessor(arr);
		Thread t1 = new Thread(hmp, "t1");
		Thread t2 = new Thread(hmp, "t2");
		Thread t3 = new Thread(hmp, "t3");
		
		long start = System.currentTimeMillis();
		//start all
		the threads
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Time taken = " + (System.currentTimeMillis() - start));
		//check the shared variable value now
		System.out.println(Arrays.asList(hmp.getMap()));
		}catch(InterruptedException e) {e.printStackTrace();}
	}
}


