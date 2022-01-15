package com.customexceptions;

public class TestMyExceptionByUser {

	public static void main(String[] args) {
		int a = 5;
		int b = -1;
		
		ClassThrowsMyException ctme = new ClassThrowsMyException();
		try {
			//add method throws checked exception which must be specified or handled
		int c = ctme.add(a, b);
		System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
