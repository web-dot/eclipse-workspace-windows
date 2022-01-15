package com.uttara.stringreverse;

public interface StringReverse {
	
	String reverseStringFast(String str);
	String reverseStringABitSlow(String str);
}


class ReverseString implements StringReverse{
	
	public  String reverseStringFast(String str) {
		
		double start = System.currentTimeMillis();
		
		char[] ca = str.toCharArray();
		for(int i = 0; i < ca.length/2; i++) {
			//char a = str.charAt(i);
			
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[ca.length-i-1] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
		}
		
		double end = System.currentTimeMillis();
		
		System.out.println("total time for reverseStringFast= " + (end - start));
		
		return new String(ca);
	}
	
	
	public String reverseStringABitSlow(String str) {
		
		double start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		
		double end = System.currentTimeMillis();
		
		System.out.println("total time for reverStringABitSlow= " +  (end - start));
		
		return sb.toString();
	}
	
	
}
