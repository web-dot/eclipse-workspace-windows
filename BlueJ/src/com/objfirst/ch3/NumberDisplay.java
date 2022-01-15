package com.objfirst.ch3;

public class NumberDisplay {
	private int limit;
	private int value;
	
	public NumberDisplay(int rollOverLimit) {
		limit = rollOverLimit;
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getDisplayValue() {
		if(value < 10) {
			return "0" + value;
		}
		else {
			return "" + value;
		}
	}
	
	public void setValue(int replacementValue) {
		if(replacementValue >= 0 && replacementValue < limit) {
			value = replacementValue;
		}
	}
	public void increment() {
		value = (value + 1) % limit;
	}
}
