package com.mytest;

public class EatList implements Runnable{
	
	public void run() {
		eat();
	}
	public synchronized void eat() {
		try {
			if(Store.list.size() == 0) {
				System.out.println(Store.list.size());
				wait();
				System.out.println("waiting for fill");
			}
			if(Store.list.size() == 5) {
				System.out.println(Store.list.size());
				for(int i = 0; i < Store.list.size(); i++) {
					Store.list.remove(i);
				}
				notifyAll();
				System.out.println("after notifyAll in eat");
				System.out.println(Store.list.size());
			}

		}catch(InterruptedException e) {e.printStackTrace();}
		
	}
}
