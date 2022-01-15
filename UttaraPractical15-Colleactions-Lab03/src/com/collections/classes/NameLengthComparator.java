package com.collections.classes;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
	
}
