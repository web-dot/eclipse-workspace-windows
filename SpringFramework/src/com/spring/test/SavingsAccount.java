package com.spring.test;

public class SavingsAccount implements Account{
	
	public void deposit() {
		
		System.out.println("depositing in SavingsAccount");
	};
	
	
	public void withdraw() {
		System.out.println("withdrawind from SavingsAccount");
	}
	
}
