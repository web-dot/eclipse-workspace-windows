package com.uttara.account;

public class BankAccount extends Account{
	
	double maxBalance;
	double minBalance;
	
	
	public double checkBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		if(amt <= 0) {
			System.out.println("amount can not be negetive or 0");
		}
		if(getBalance() + amt > getMaxBalance()) {
			System.out.println("Exceedng Maxixmum balance" );
		}
		setBalance(getBalance() + amt);
	}
	
	public double withdraw(double amt) {
		if(amt > getBalance()) {
			System.out.println("insufficient funds");
		}
		else if(amt <= 0) {
			System.out.println("amount can not be negetive or 0");
		}
		else if(getBalance() - amt < getMinBalance()) {
			System.out.println("insufficient funds!!! account can not have less funds than Minimum Bal");
		}
		else {
			setBalance(getBalance()-amt);
		}
		return getBalance();
	}
	
	

	public double getMaxBalance() {
		return maxBalance;
	}

	public void setMaxBalance(double maxBalance) {
		this.maxBalance = maxBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBlance(double minBlance) {
		this.minBalance = minBlance;
	}
	
	
}
