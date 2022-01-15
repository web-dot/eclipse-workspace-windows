package com.uttara.resource;

public class PrimeNumberJob implements Runnable {

	private long range;
	private long primeNum;
	
	public long getPrimeNum()
	{
		return primeNum;
	}
	
	public PrimeNumberJob(long n) {
		range = n;
	}
	
	@Override
	public void run() {
		
		// first get a random number within the range
		// then check if it prime. if not, loop
		boolean flag = true;
		outer:while(flag)
		{
			long val = (long)(Math.random()*range);
			if(val%2 == 0)
					continue;
			for(int i = 3 ; i < (long) Math.sqrt(val) ;i+=2)
			{
				if(val%i == 0)
					continue outer;
			}
			//num is prime!!
			primeNum = val;
		//	System.out.println("primeNumb generated = "+val);
			flag = false;
			
		}
		

	}

}
