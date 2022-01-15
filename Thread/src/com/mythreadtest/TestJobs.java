package com.mythreadtest;

public class TestJobs {

	public static void main(String[] args) throws InterruptedException {
		Job01 j1 = new Job01("Sudip");
		Job02 j2 = new Job02();
		Job03 j3 = new Job03();
		
		Thread t1 = new Thread(j1, "THREAD-01");
		Thread t2 = new Thread(j1, "THREAD-02");
		Thread t3 = new Thread(j1, "THREAD-03");
		
		System.out.println("main method :" + 	Thread.currentThread().getName()+ " : " + Thread.currentThread().getState() + " ##################################");
		System.out.println("main method :" +  	t1.getName()+ " : " + t1.getState() + " ##################################");
		System.out.println("main method :" +	t2.getName()+ " : " + t1.getState() + " ##################################");
		System.out.println("main method :" +	t3.getName()+ " : " + t1.getState() + " ##################################");
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("main method :" +Thread.currentThread().getName() + " : " +Thread.currentThread().getState() +" : displaying " +j1.getName() + ", retrieved using Getter Method from " + j1.getClass());
		
		t1.start();
		t2.start();
		t3.start();

		t2.interrupt();
		
		System.out.println("main method :" +Thread.currentThread().getName()+ " : " + Thread.currentThread().getState() + " 000000000000000000000000000000000000000000");
		System.out.println("main method :" +t1.getName()+ " : " + t1.getState() + " 000000000000000000000000000000000000000000");
		System.out.println("main method :" +t2.getName()+ " : " + t1.getState() + " 000000000000000000000000000000000000000000");
		System.out.println("main method :" +t3.getName()+ " : " + t1.getState() + " 000000000000000000000000000000000000000000");
	}

}
