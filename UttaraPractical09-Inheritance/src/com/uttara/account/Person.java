package com.uttara.account;

public class Person {
	
	
	private String name;
	private Account acc;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void buyItem(String name, double amount) {
		if(getAcc().getBalance() >= amount) {
			if(getAcc() instanceof BankAccount) {
				BankAccount ba = (BankAccount)getAcc();
				if(ba.getBalance() - amount > ba.getMinBalance()) {
					ba.withdraw(amount);
					System.out.println(amount + " withdrwan from BankAccount to buy " + name);
				}
				else if((ba.getBalance() - amount < ba.getMinBalance())){
					System.out.println("insufficient funds!!! account can not have less funds than Minimum Bal");
				}
			}
			
			if(getAcc() instanceof CreditCard) {
				CreditCard cc = (CreditCard)getAcc();
				if(cc.getBalance() - amount > cc.getMinBalance()) {
					cc.withdraw(amount);
					System.out.println(amount + " withdrwan from CreditCard to buy " + name);
				}
				else if(cc.getBalance() - amount < cc.getMinBalance()) {
					System.out.println("insufficient funds!!! account can not have less funds than Minimum Bal");
				}
			}
		}
	}
	
	public void debitAmount(double amount) {
		if(getAcc() instanceof BankAccount) {
			BankAccount ba = (BankAccount)getAcc();
			if(getAcc().getBalance() + amount > ba.maxBalance) {
				System.out.println("can't exceed Max Limit");
			}
			else {
				getAcc().deposit(amount);
			}
		}
		if(getAcc() instanceof CreditCard) {
			CreditCard cc = (CreditCard)getAcc();
			cc.deposit(amount);
		}
	}
}
