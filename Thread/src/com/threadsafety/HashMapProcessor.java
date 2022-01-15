package com.threadsafety;

public class HashMapProcessor implements Runnable{
	
	private String[] strArr = null;
	
	public HashMapProcessor(String[] m) {
		this.strArr = m;
	}
	
	public String[] getMap() {
		return strArr;
	}
	
	@Override
	public void run() {
		processArr(Thread.currentThread().getName());
	}
	
	private void processArr(String name) {
		for(int i = 0; i < strArr.length; i++) {
			//process data and append thread name
			processSomething(i);
			addThreadName(i, name);
			
		}
	}
	
	private void addThreadName(int i, String name) {
		strArr[i] = strArr[i] + " : " + name;
	}
	
	private void processSomething(int index) {
		//processing job
		try {
			Thread.sleep(index * 1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
