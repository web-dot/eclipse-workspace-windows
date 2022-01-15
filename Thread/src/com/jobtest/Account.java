package com.jobtest;

//shared resource

public class Account {
	double loan;
	int balance = 50000;
	double interestRate = 0.05;
	int timePeriod = 10;
	int numOfInterests = 12;
	
	public Account(double loan) {
		this.loan = loan;
	}
	
	
	public synchronized void calcComp() {
		if(balance > 30000) {
			double p = timePeriod * numOfInterests;
			double r = (1 + interestRate/numOfInterests);
			double finalAmount = loan * Math.pow(r, p);
			balance = (int)(balance - finalAmount);
			System.out.println(Thread.currentThread().getName() + " : "  + balance);
		}
		else {
			System.out.println("balance is too low for the loan");
		}
		//return balance;
	}
	
}
