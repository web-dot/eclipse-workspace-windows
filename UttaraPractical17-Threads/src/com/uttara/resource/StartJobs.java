package com.uttara.resource;

public class StartJobs {

	public static void main(String[] args) {
		
		PrimeNumberJob job1 = new PrimeNumberJob(100000);
		Thread t1 = new Thread(job1);
		t1.start();

	}

}
