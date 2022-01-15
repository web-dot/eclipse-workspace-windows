package com.uttara.practical05;

import java.util.Comparator;

public class ArrayComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
