package com.uttara.test;

import java.io.IOException;

import com.uttara.classes.ParamJob;

public class TestParam {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("main starts---->");
		ParamJob paramJob01 = new ParamJob();
		
		Thread t1 = new Thread(paramJob01);
		t1.start();
		
		//System.out.println(paramJob01.getOutput()); //prints 0
		/*
		 * Q]Observe what value is printed out. Why?
		 * a]0 is printed out because getOutput() is called on the main stack only
		 * and the default value of the instance variable of the thread object 
		 * to which t1 is pointing to, is printed which is 0.
		 * 
		 *  
		 * */
		
		//invoking join on t1
		
		t1.join();
		
		System.out.println(paramJob01.getOutput());
		
		
		/*
		 * ->join() blocks the calling thread until the thread whose join() method
		 * is called has completed.
		 *->in this case main() thread calls the join() method of, so main thread
		 *is blocked until t1 thread completes.
		 * 
		 * 
		 * 
		 * */
		System.out.println("main ends----->");
		
		System.out.println((int)'a');
	}

}























