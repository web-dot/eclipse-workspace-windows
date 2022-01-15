package com.uttara.resource;

public class Job implements Runnable {

	@Override
	public void run() {
		try {
		for(int i = 0 ; i < 100 ; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " i = "+i+" priority = "+Thread.currentThread().getPriority());

				Thread.sleep(500);
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		Job job = new Job();
		Thread t1 = new Thread(job);
		t1.setName("Hero");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(job);
		t2.setName("Zero");
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}
