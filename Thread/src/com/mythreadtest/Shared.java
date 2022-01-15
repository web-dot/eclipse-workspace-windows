package com.mythreadtest;

public class Shared {
	int i;
	void sharedMethod() {
		i = 10;
		System.out.println(Thread.currentThread().getName() + " : " + i);
		i = 20;
		System.out.println(Thread.currentThread().getName() + " : " + i);
		i = 30;
		System.out.println(Thread.currentThread().getName() + " : " + i);
	}
}
