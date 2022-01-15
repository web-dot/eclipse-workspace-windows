package com.accountapp;

public class App {
	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized(this) {
			if(balance <= 0) {
				try {
					wait();
					System.out.println("Waiting for balance updation");
				}catch(InterruptedException e) {e.printStackTrace();
			}
		}	
	}
	balance = balance - amount;
	System.out.println("Withdrawl successful and the current balance is: " + balance);
	}
	
	public void deposit(int amount) {
		System.out.println("We are depositing the amount");
		balance = balance + amount;
		synchronized(this) {
			notify();
		}		
	}
	
	public static void main(String[] args) {
		App app = new App();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				}catch(InterruptedException e) {e.printStackTrace();}
				app.deposit(2000);
			}
		});
		
		thread2.setName("Thread2");
		thread2.start();
		
		
		
		
		
		
		
		
		
	}
}
