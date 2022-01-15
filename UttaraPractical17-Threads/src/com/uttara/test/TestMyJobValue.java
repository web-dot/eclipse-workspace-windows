package com.uttara.test;

import com.uttara.classes.*;

public class TestMyJobValue {

	public static void main(String[] args) {
		
		//starting two threads
		new Thread(new MyJobValue(10)).start();
		new Thread(new MyJobValue(1000)).start();

		
	}

}
