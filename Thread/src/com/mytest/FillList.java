package com.mytest;

public class FillList implements Runnable {
	
	public void run() {
		fill();
	}
	
	public synchronized void fill() {
		try {
			if(Store.list.size() == 0) {
				for(int i = 0; i < 5; i++) {
					Store.list.add((int)(Math.random()*100));
					System.out.println("adding " + Store.list.get(i));
				}
				System.out.println("after notyfyAll in fill");
				notifyAll();
				System.out.println(Store.list.size());
			}
			if(Store.list.size() > 0) {
				System.out.println("waiting for eat");
				wait();
			}
		}catch(InterruptedException e) {e.printStackTrace();}
	}
}
