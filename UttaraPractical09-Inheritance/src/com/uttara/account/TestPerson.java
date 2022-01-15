package com.uttara.account;

public class TestPerson {

	public static void main(String[] args) {
		
		
		System.out.println("--------------Person with BankAccount--------------");
		
		//CREATING PERSON
		Person p1 = new Person();
		
		//CREATING BANK ACCOUNT
		Account a1 = new BankAccount();
		
		//LINKING ACCOUNT TO PERSON
		p1.setAcc(a1);
		
		//SETING MIN BALANCE AND MAX BALANCE
		BankAccount b1 = (BankAccount)a1;
		b1.setMinBlance(10000);
		b1.setMaxBalance(500000);
		
		//CHECKING BALANCE
		System.out.println(p1.getAcc().checkBalance());
		
		//PERSON DBITING AMOUNT
		p1.debitAmount(50000);
		
		//BUYING ITEM
		p1.buyItem("laptop1", 20000);
		
		
		System.out.println(p1.getAcc().checkBalance());
		
		//BUYING SO BALANCE DROPS THAN MIN BAL
		p1.buyItem("laptop2", 25000);
	
		
		System.out.println(p1.getAcc().checkBalance());
		
		//DEBIT MORE THAN MAX BAL
		p1.debitAmount(1000000);
		
		
		System.out.println(p1.getAcc().checkBalance());
		
		
		System.out.println();
		System.out.println("--------------Person with CreditCard--------------");
		
		
		Person p2 = new Person();
		
		Account a2 = new CreditCard();
		
		p2.setAcc(a2);
		
		CreditCard cc = (CreditCard)a2;
		cc.setMinBalance(-20000);
		
		System.out.println(p2.getAcc().checkBalance());
		
		p2.debitAmount(30000);
		
		p2.buyItem("laptop2", 20000);
		
		System.out.println(p2.getAcc().checkBalance());
		
		p2.debitAmount(50000);
		
		System.out.println(p2.getAcc().checkBalance());
	}

}
