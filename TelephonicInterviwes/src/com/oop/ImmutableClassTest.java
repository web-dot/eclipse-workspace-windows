package com.oop;


public class ImmutableClassTest{
	public static void main(String[] args) {
		
		MyImmutableClass c1 = new MyImmutableClass("sudip", 35);
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
	}
}