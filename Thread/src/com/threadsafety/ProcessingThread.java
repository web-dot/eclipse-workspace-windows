package com.threadsafety;

public class ProcessingThread implements Runnable {
	private int count;
	@Override
	public void run() {
		for(int i = 1; i < 5; i++) {
			//processSomething(i);
			count++;
		}
	}
	public int getCount() {
		return this.count;
	}
	/*private void processSomething(int i) {
		//process some job
		try {
			Thread.sleep(i * 1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}*/
}
