package com.mytest;

public class Test {

	public static void main(String[] args) {
		FillList f = new FillList();
		EatList e = new EatList();
		
		Thread t1 = new Thread(f, "fillThread");
		Thread t2 = new Thread(e, "eatThread");
		
		t1.start();
		t2.start();
	}

}
