package com.Oracle;


/*The following example brings together some of the concepts of this 
 * section. SimpleThreads consists of two threads. The first is the 
 * main thread that every Java application has. The main thread creates 
 * a new thread from the Runnable object, MessageLoop, and waits for it 
 * to finish. If the MessageLoop thread takes too long to finish, the main 
 * thread interrupts it. The MessageLoop thread prints out a series of 
 * messages. If interrupted before it has printed all its messages, the 
 * MessageLoop thread prints a message and exits.*/

public class SimpleThreads {
	
	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run() {
			String[] importantInfo = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A Kid will eat ivy too"};
		try {
			for(int i = 0; i < importantInfo.length; i++) {
				//pause for 4 seconds
				Thread.sleep(4000);
				//print a message
				threadMessage(importantInfo[i]);
			}
		}catch(InterruptedException e) {threadMessage("I wasn't done!");}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
	
		//Delay in milliseconds before we interrupt MessageLoop thread(default one hour)
		long patience = 1;
		
		//If command line argument present, gives patience in seconds
		if(args.length > 0) {
			try {
			patience = Long.parseLong(args[0]) * 1000;
			}catch(NumberFormatException e) {
				System.out.println("Argument must be an interrupt");
				System.exit(1);
				}
			}
		threadMessage("Starting Messageloop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.setName("MessageLoopThread");
		t.start();
		
		threadMessage("Waiting for MessageLoop thread to finish");
		
		//loop until messageLoop thread exits
		while(t.isAlive()) {
			threadMessage("Still waiting...");
			//wait maximum of 1 second for messageLoop thread to finish
			t.join();
			if(System.currentTimeMillis() - startTime > patience && t.isAlive()) {
				threadMessage("Tired of Waiting!");
				t.interrupt();
				//Shouldn't be long now
				//--wait indefinitely
				t.join();
			}
		}
		threadMessage("Finally");
		
		
		
		}

	}

}
