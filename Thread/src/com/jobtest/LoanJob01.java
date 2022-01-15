package com.jobtest;

public class LoanJob01 implements Runnable {
	Account acc;
	public LoanJob01(Account acc) {
		this.acc = acc;
	}
	
	public void run() {
		acc.calcComp();
	}
}
