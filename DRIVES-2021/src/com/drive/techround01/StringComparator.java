package com.drive.techround01;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
