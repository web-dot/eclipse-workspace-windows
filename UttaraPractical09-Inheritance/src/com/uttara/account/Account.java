package com.uttara.account;

public class Account {
	
	double balance;
	
	
	public double checkBalance() {
		
		return balance;
	}
	
	
	public void deposit(double amt) {
		if(amt <= 0) {
			System.out.println("amount can not be negetive or 0");
		}
		setBalance(getBalance()+amt);
	}

	public double withdraw(double amt) {
		if(amt > getBalance()) {
			System.out.println("insufficient funds");
		}
		if(amt <= 0) {
			System.out.println("amount can not be neegetive or 0");
		}
		setBalance(getBalance()-amt);
		return amt;
	}
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
