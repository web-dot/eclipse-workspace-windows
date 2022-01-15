package com.printresource;

public class TestPrints {

	public static void main(String[] args) {
		PrintResource p1 = new PrintResource();
		p1.setName("p1");
		p1.start();
		
		PrintResource p2 = new PrintResource();
		p2.setName("p2");
		p2.start();
		
		PrintResource p3 = new PrintResource();
		p3.setName("p3");
		p3.start();
		
		PrintResource p4 = new PrintResource();
		p4.setName("p4");
		p4.start();
		
		try {
		p1.join();
		p2.join();
		p3.join();
		p4.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("final size of arralist  " + PrintResource.arrayList.size());
		
		
		
	}

}
