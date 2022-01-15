package com.customexceptions;

public class TestMyException {

	public static void main(String[] args) {
		try {
			throw new MyException();
		}catch(MyException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}

	}

}
