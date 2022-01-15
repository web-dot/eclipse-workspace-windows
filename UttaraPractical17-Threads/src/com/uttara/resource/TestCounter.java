package com.uttara.resource;

public class TestCounter {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		JobCount job = new JobCount(c);

		Thread t1 = new Thread(job);
		t1.setName("Ramanna");
		Thread t2 = new Thread(job);
		t2.setName("Laxmana");
		
		t1.start();
		t2.start();
	}

}
