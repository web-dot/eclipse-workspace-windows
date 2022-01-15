package com.uttara.practical04;

class Pen{
	int inkQty;
	String color;
	public void write(String text) {
		if(inkQty > 0) {
			System.out.println(text);
			inkQty--;
		}
		else {
			System.out.println("kindly refill(assign positive value to inkQty!!) to write");
		}
	}
}


public class TestPen {

	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		p1.inkQty = 10;
		p2.inkQty = 20;
		
		p1.write("happy pen writing!!");
		p2.write("more happy pen writing!!!");
		
		

	}

}
