package com.uttara.resource;

public class JobCount implements Runnable {

	Counter counter;
	public JobCount(Counter c)
	{
		this.counter = c;
	}
	@Override
	public void run() {
		
		for(int i = 0 ; i < 1000 ; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+counter.incCount());
		}

	}

}
