package com.guardedblock.oracle;

public class Drop {
	//message send from producer to consumer
	private String message;
	//true if consumer should wait for producer to 
	//send message. False if producer should wait 
	//for consumer to retrieve message.
	private boolean empty = true;
	public synchronized String take() {
		//wait until message is available
		while(empty) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//toggle status
		empty = true;
		//notify producer that status has changed
		notifyAll();
		return message;
	}
	public synchronized void put(String message) {
		//wait until message has been retrieved
		while(!empty) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		//Toggle status
		empty = false;
		//store message
		this.message = message;
		//notify consumer that status has changed
		notifyAll();
	}
}
