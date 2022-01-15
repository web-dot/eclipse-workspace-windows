package com.consumerproducer;

import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> taskQueue;
	public Consumer(List<Integer> sharedQueue) {
		this.taskQueue = sharedQueue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void consume() throws InterruptedException{
		synchronized(taskQueue) {
			while(taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting, size: " + taskQueue.size());
				taskQueue.wait();	
			}
			Thread.sleep(100);
			int i = (Integer)taskQueue.remove(0);
			System.out.println("Consumed " + i);
			taskQueue.notifyAll();
		}
	}
}
