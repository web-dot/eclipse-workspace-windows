package com.TestPgms;

import javax.print.DocFlavor.STRING;

public class TestOps {

	public static void main(String[] args) {
		
		Thread st = new Thread(new Op1(), "ST");
		Thread nt = new Thread(new Op2(), "NT");
		
		st.start();
		nt.start();
		
		
		nt.setPriority(Thread.MAX_PRIORITY);
		st.setPriority(Thread.MIN_PRIORITY);
		
	
			//nt.join();
			//st.join();

			
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is the main thread" );
		}

	}

}
