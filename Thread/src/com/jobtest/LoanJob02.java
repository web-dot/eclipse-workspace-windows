package com.jobtest;

public class LoanJob02 implements Runnable {
	Account acc;
	public LoanJob02(Account acc) {
		this.acc = acc;
	}
	public void run() {
		acc.calcComp();
	}
}
