

package com.uttara.account;

public class CreditCard extends Account{
	
	double minBalance;
	
	public void deposit(double amt) {
		if(amt <= 0) {
			System.out.println("amount can not be negetive or 0");
		}
		setBalance(getBalance() + amt);
	}
	
	public double withdraw(double amt) {
		if(amt > getBalance()) {
			System.out.println("insufficient funds");
		}
		if(amt <= 0) {
			System.out.println("amount can not be negetive or 0");
		}
		if(getBalance() - amt < getMinBalance()) {
			System.out.println("insufficient funds!!! account can not have less funds than Minimum Bal");
		}
		setBalance(getBalance()-amt);
		return amt;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
	
}
