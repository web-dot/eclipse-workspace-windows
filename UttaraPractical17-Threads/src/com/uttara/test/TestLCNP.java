package com.uttara.test;

import com.uttara.classes.*;

public class TestLCNP {

	public static void main(String[] args) throws InterruptedException {


		LetterCountJob job01 = new LetterCountJob("D:\\Java\\ref\\J2SE-J2EE\\IO\\testtxt");
		NextPrimeJob job02 = new NextPrimeJob(10000);
		
		Thread t1 = new Thread(job01);
		Thread t2 = new Thread(job02);
		
		
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		
		
		System.out.println("no of letters in file : " + job01.getCount()); 
		System.out.println("long prime number : " + job02.getPrimeNumber());
		
		
		//verifying sequential execution // in this case sequential execution is faster
		//job02.run(); 
		//job01.run(); 
		

	}

}
