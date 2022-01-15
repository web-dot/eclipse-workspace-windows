package com.uttara.ex;

public class TestEx{
	public void m3(Animal a) {
		System.out.println("in m3()");
		Pig p = (Pig)a;
	}
	public void m2() {
		System.out.println("in m2()");
		Animal a = new Animal();
		m3(a);
		Pig p = new Pig();
		m3(p);
	}
	public void m1() {
		System.out.println("in m1()");
		m2();
	}
}
