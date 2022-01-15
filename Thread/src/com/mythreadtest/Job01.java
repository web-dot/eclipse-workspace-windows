package com.mythreadtest;

public class Job01 implements Runnable {
	String name;
	String greet;
	public Job01(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println("Job01 : " +Thread.currentThread().getName() +  " : " + Thread.currentThread().getState() + " executing run() ---------------------");
		System.out.println("Job01 : " +Thread.currentThread().getName() +  " : " +Thread.currentThread().getState() +" displaying " + name + ", as a parameter to constructor");
		greet = name + " says hi";
		System.out.println("Job01 : " + Thread.currentThread().getName() + " : " +Thread.currentThread().getState() +" displaying output " + greet );
	
		for(int i = 0; i < 10; i++) {
			if(Thread.currentThread().interrupted()){
				System.out.println(Thread.currentThread().getName() + " interrupted");
				return;
			}
			System.out.println("Job01 : " + Thread.currentThread().getName() +  " : " + Thread.currentThread().getState() + " inside for " + " ++++++++++++++++++++++++++++++++++");
			//Thread.sleep(4000);
			System.out.println("Job01 : " + Thread.currentThread().getName() +  " : " + Thread.currentThread().getState() + " after sleep " + " ******************************");
			System.out.println("Job01 : " +Thread.currentThread().getName() +   " : " + Thread.currentThread().getState() + " printing " + name );
			
		}
	}
		
	
	public String getName() {
		return this.name;
	}
}
