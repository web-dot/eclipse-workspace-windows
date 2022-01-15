package com.customexceptions;
//non-user facing
public class ClassThrowsMyException {
	public int add(int a, int b) throws MyException {
		if(a < 0 || b < 0) {
			throw new MyException("please input positive values");
		}
		else {
			return a + b;
		}
	}
}
