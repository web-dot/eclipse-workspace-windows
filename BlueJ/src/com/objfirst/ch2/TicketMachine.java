package com.objfirst.ch2;

public class  TicketMachine {
	private int price;
	private int balance;
	private int total;
	
	
	public TicketMachine(int cost) {
		price = cost;
		balance = 0;
		total = 0;
	}
	
	public int getPrice() {
		return price;
	}
	public int getBalance() {
		return balance;
	}
	public void setPrice(int amt) {
		price = price + amt;
	}
	public void inserMoney(int amount) {
		balance = balance + amount;
	}
	public void printTicket() {
		System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
	}
}
