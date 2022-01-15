package com.uttara.test;

import com.uttara.classes.*;


public class TestCounterJob {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		
		CountJob job01 = new CountJob(c1);
		
		Thread t1 = new Thread(job01);
		Thread t2 = new Thread(job01);
		
		
		t1.start();
		t2.start();
		
		
		/*
		 * What was the problem
		 * 
		 * two operations were interleaving, as there were two threads
		 * acting on the same data.
		 * 
		 *  the simple operation like ++c can be broken down as
		 *  
		 *  ->Retrieve the current value of c
		 *  ->Increment the retrieved value by 1
		 *  ->Store the incremented value back in c
		 *  
		 *  the operations of the two threads might interleave as 
		 *  they are performed on the same data.
		 *  
		 *  when incCount() is marked synchronized, it is not possible
		 *  for two invocations of synchronized methods on same object 
		 *  to interleave as one thread that is executing the synchronized
		 *  block must release the lock for other threads that invoke a
		 *  synchronized block or method. Which resolves the interleaving
		 *  in this case.
		 *  
		 * */
	}

}
