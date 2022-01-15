package com.uttara.practical08;

public class UpperToLower {

	
	public static String UpToLowToUp(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
			sb.append(Character.toUpperCase(c));
			}
			else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(UpToLowToUp("aBC$1"));
		System.out.println(UpToLowToUp("a"));
		System.out.println(UpToLowToUp(""));
		System.out.println(UpToLowToUp("aLiEns *_* pROGrammINg in JavA"));
	}

}
