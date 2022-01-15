package com.uttara.classes;

public class NextPrimeJob implements Runnable{
	
	long val;
	long primeNumber;
	
	public NextPrimeJob(long val) {
		this.val = val;
	}
	
	@Override
	public void run() {
		long t1 = System.currentTimeMillis();
		while(true) {
			long genVal = (long)(Math.random()*10000000L);
			if(checkPrime(genVal)) {
				primeNumber = genVal;
				break;
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println("total time : " + (t2-t1));
	}
	
	public static boolean checkPrime(long num) {
		if(num == 0 || num == 1) {
			return false;
		}
		if(num == 3 || num == 5 || num == 7) {
			return true;
		}
		if(num % 2 == 0) {
			return false;
		}
		for(int i=3; i<Math.sqrt(num)+1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public long getPrimeNumber() {
		return primeNumber;
	}
}
