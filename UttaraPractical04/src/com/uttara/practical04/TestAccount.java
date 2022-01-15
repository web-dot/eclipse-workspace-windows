package com.uttara.practical04;

class Account{
	String accNumber;
	String owner;
	double balance;
	public Account(String owner) {
		this.owner = owner;
	}
	
	public void withdarw(double amt) {
		if(amt >= 0 && amt < balance) {
			balance = balance - amt;
			System.out.println("[balance = " + balance + "]");
		}
		else {
			System.out.println("Please do not enter negetive value and check if you have enough balance");
		}
	}
	
	public void debit(double amt) {
		if(amt >= 0) {
			balance = balance + amt;
			System.out.println("[Balance = " + balance + "]");
		}
		else {
			System.out.println("please enter positive amount");
		}
	}
	
	public void checkBalance() {
		System.out.println("[Balance = " + balance + "]");
	}
}


public class TestAccount {

	public static void main(String[] args) {
			
		Account acc1 = new Account("Ravi");
		Account acc2 = new Account("Shyamu");
		
		acc1.checkBalance();
		acc2.checkBalance();
		
		acc1.withdarw(100);
		acc2.withdarw(100);
		
		acc1.debit(10000);
		acc1.checkBalance();
		
		
		acc1.withdarw(500000);
		
		acc1.withdarw(5000);
		
		acc2.checkBalance();
		
		acc2.balance = acc1.balance;
		acc2.checkBalance();
		
		
		acc2.withdarw(3000);
		
		acc1 = acc2;
		
		acc1.checkBalance();
		acc2.checkBalance();
		acc1.debit(50000);
		acc2.checkBalance();
		

	}

}
