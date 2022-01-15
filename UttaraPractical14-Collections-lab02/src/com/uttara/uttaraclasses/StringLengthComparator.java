package com.uttara.collections;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	
	@Override
	public int compare(String o1, String o2) {
		
		return o1.length() - o2.length();
	}
	/*
	  @Override
	public int compare(Object o1, Object o2) {
		
		  if(o1 instanceof String && o2 instanceof String)
		  {
			  String s1 = (String) o1;
			  String s2 = (String) o2;
			  
			  return s1.length() - s2.length();
		  }
		  else
			  throw new IllegalArgumentException("only strings can be compared")
	}*/
}
