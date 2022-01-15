package com.uttara.test;

import com.uttara.classes.*;


public class TestThread2 {

	public static void main(String[] args) {
		
		//creating obj of myjob
		MyJob myJob01 = new MyJob();
		
		//creating thread obj and passing myjob reference as parameter
		Thread t1 = new Thread(myJob01);
		Thread t2 = new Thread(myJob01);
		
		//setting name
		t1.setName("ramu");
		t2.setName("gomu");
		
		//starting the threads
		t1.start();
		t2.start();
		
		
		/*
		 * Q]Is there a difference between first approach and the second approach?
		 * ->as per my understanding, there is no difference between first approach and
		 * the second approach.
		 * Q] Which is better?
		 * ->The first approach is easier to use in simple applications, but is limited by
		 * the fact that the task class must be a descendant of Thread.
		 * The second approach separates the the Runnable task from the Thread object that 
		 * executes the task. This approach is probably better as it is more flexible and
		 * is applicable to high level thread management APIs.
		 * */

	}

}
