package com.singleton.test01;


class Singleton{
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}



public class TestSingleton {

	public static void main(String[] args) {

		System.out.println(Singleton.getSingleton()); 
		System.out.println(Singleton.getSingleton());
		
	}

}
