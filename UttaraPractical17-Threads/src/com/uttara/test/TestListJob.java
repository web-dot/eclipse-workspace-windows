package com.uttara.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.uttara.classes.ListJob;

public class TestListJob {

	public static void main(String[] args) throws InterruptedException {
		
		//creating List object
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 1, 5));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-1000, -1000, -1000));
		
		//creating ListJob object
		ListJob job01 = new ListJob(list2);
		
		//creating Thread and passing a runnable object to the Thread contructor
		Thread t1 = new Thread(job01);
		
		//starting the thread
		t1.start();
		
		//invoking join() on t1 which will block main thread until t1 completes and will printt the calculated return 
		t1.join();
		
		//invoking getter on Runnable
		System.out.println(job01.getVal()); 
		

	}

}
