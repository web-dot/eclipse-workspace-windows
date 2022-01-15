package com.uttara.ex;

public class Card {
	
	//instance variables
	private String accNumber;
	private double balance;
	
	
	//validate methods
	private boolean validateAccNumber(String accNumber) {
		if(accNumber == null || accNumber.isEmpty() || accNumber.equals(" ")) {
			return false;
		}
		else {
			return true;
		}
	}
	private boolean validateBalance(double balance) {
		if(balance < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//constructor
	public Card(String accNumber, double balance) {
		if(validateAccNumber(accNumber)) {
			this.accNumber = accNumber;
		}
		else {
			throw new IllegalArgumentException("Kindly check the Account number");
		}
		if(validateBalance(balance)) {
			this.balance = balance;
		}
		else {
			throw new IllegalArgumentException("You are entering negetive Balance!");
		}
	}
	
	//getter and setter
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		if(validateAccNumber(accNumber)) {
			this.accNumber = accNumber;
		}
		else {
			throw new IllegalArgumentException("invalid accNumber");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(validateBalance(balance)) {
			this.balance = balance;
		}
		else {
			throw new IllegalArgumentException("cant do! negetive balance");
		}
	}
}
