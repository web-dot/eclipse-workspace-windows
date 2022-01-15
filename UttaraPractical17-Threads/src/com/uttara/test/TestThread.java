package com.uttara.test;
import java.io.IOException;

import com.uttara.classes.PrintThread;


public class TestThread {

	public static void main(String[] args) throws IOException, InterruptedException{

		
		System.out.println("main starting---->");
		PrintThread printThread01 = new PrintThread();
		//setting name
		printThread01.setName("Bingo");
		//setting priority
		//printThread01.setPriority(10);
		printThread01.start();
		

		//calling start again on PrintThread() object
		//printThread01.start(); // IllegalStateException
		
		/*
		 * a]do you know what happens when start() is invoked on Thread object
		 * ->a new thread of execution is started when start() is invoked on Thread object
		 * 
		 * b]what happens if you call start() more than once on the same object
		 * -> it will throw a IllegalStateException
		 *
		 *c]what happens if you call run() on PrintThread obj instead of start()
		 *-> if run() is called on PrintThread object it will be executed in the 
		 *same thread of execution, a new thread will not be started.
		 *->The output will be the same in this case, but if multiple jobs need
		 *to run in parallel then calling run() method on a thread obj will execute 
		 *the jobs one after the another, which we do not want, we want that the 
		 *jobs should run in parallel in different ToEx.
		 *
		 *
		 * 
		 */
		
		
		//creating another object of PrintThread
		PrintThread printThread02 = new PrintThread();
		//setting name
		printThread02.setName("Bongo");
		//setting priority
		//printThread02.setPriority(1);
		printThread02.start();
		
		
		/*
		 * f]Execute 2-3 time . Are you getting same output? why not
		 * -> priority does not give deterministic output.
		 * 	What if we can do can  we get fairly deterministic output?
		 *
		 *h]main thread will not crash as it is running in a separate thread of 
		 *execution
		 *
		 *
		 * */

		System.out.println("main ending---->");
	}

}
