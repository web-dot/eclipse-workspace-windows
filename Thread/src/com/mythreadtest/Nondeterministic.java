package com.mythreadtest;

public class Nondeterministic {
	
	private int x = 0;
	private int y = 0;
	
	public synchronized void write() {
		x = 2;
		y = 3;
		System.out.println(Thread.currentThread().getName() + " : write: x: " + x + ", y: " + y);
	}
	
	public void read() {
		System.out.println(Thread.currentThread().getName() + " : read: x: " + x + ", y: " + y);
		x = 0;
		y = 1;
	}

	public static void main(String[] args) {
				final Nondeterministic nd = new Nondeterministic();
				//anonymous inner class
				Thread t1 = new Thread( new Runnable(){
					@Override
					public void run() {
						while(true) {
							nd.read();
							try {
								Thread.sleep(500);
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
				Thread t2 = new Thread(new Runnable() {
					@Override
					public void run() {
						while(true) {
							nd.write();
							try {
								Thread.sleep(500);
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
				
				t1.start();
				t2.start();
	}

}
