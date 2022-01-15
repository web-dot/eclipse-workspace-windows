package com.uttara.resource;

public class CounterJob implements Runnable{

int count=0;

@Override
public void run() {
	try
	{
		for(int i = 0 ; i < 1000 ; i++)
		{
			count++;
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName()+" count is "+count);
		}
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
	
public static void main(String[] args) {
	CounterJob job = new CounterJob();
	Thread t1 = new Thread(job);
	Thread t2 = new Thread(job);
	t1.start();
	t2.start();
}

}
