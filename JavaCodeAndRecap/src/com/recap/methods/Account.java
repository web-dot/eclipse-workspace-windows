package com.recap.methods;

class AbsAccount {
	int balance;
	
	//overloading
	public int deposit(int amount) {
		return balance + amount;
	}
	//overriding
	public int interest(int balance, int percent) {
		return balance + balance * percent;
	}
}

class Savings extends AbsAccount {
	//overloading
	public double deposit(double amount) {
		return balance + amount;
	}
	
	//overriding
	public int interest(int balance, int percent) {
		return balance + ((balance * percent) * 2);
	}
}

class SuperSavings extends Savings{
	//overloading
	public int deposit(int amount, int promoCode) {
		return balance + (amount + promoCode / 100);
	}
	
	//overriding
	public int interest(int balance, int percent) {
		return balance + balance * percent + 100;
	}
}


public class Account{
	public static void main(String[] args) {
		
		Savings sa1 = new Savings();
		sa1.balance = 50;
		sa1.deposit(100); //
		
		SuperSavings ss1 = new SuperSavings();
		ss1.balance = 100;
		//this works as method signatures are computed at compile time based on compile time types
		ss1.deposit(200, 10);
		
		AbsAccount abs1 = new SuperSavings();
		//this DOES NOT work as method signatures are computed at compile time based on compile time types
		//abs1.deposit(100, 10);
		
		
		
		
	}
}