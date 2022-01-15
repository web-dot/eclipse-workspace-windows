package com.jobtest;

public class TestAccounts {

	public static void main(String[] args) {
		Account a1 = new Account(20000);
		//int r = a1.calcComp();
		//System.out.println(r);
		
		LoanJob01 lj1 = new LoanJob01(a1);
		LoanJob02 lj2 = new LoanJob02(a1);
		
		
		Thread t1 = new Thread(lj1, "T1");
		Thread t2 = new Thread(lj2, "T2");
		
		t1.start();
		t2.start();
	}

}
