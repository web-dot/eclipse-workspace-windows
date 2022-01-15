package com.mythreadtest;

public class TestShared {

	public static void main(String[] args) {
		final Shared s1 = new Shared();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				s1.sharedMethod();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				s1.sharedMethod();
				}
			};
			t1.start();
			t2.start();
		}
}
