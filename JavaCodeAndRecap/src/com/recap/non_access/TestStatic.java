package com.recap.non_access;



class Employee{
	
	String name;
	static int bankVault;
	static int getBankVaultValue() {
		return bankVault;
	}
}



public class TestStatic{
	
	public static void main(String[] args) {
		
		Employee emp = null;
		
		System.out.println(emp.bankVault);
		System.out.println(emp.getBankVaultValue());
		
		System.out.println(emp.name);
		
	}
	
}