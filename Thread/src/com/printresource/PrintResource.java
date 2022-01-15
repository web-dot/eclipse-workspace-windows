package com.printresource;
import java.util.List;
import java.util.ArrayList;

public class PrintResource extends Thread {
	public static List<String> arrayList = new ArrayList<String>();
	public void addElement(String a ) {
		synchronized (arrayList) {
		arrayList.add(a);
		arrayList.notifyAll();
		}
	}
	public void removeElement() {
		synchronized(arrayList) {
			if(arrayList.size() == 0) {
				try {
					arrayList.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				arrayList.remove(0);
			}
		}
	}
	
	public void run() {
		System.out.println("Thread name -- " + this.getName());
		if(!this.getName().equalsIgnoreCase("p4")) {
			this.removeElement();
		}
		this.addElement("threads");
	}
}










