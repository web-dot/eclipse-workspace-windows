package com.recap.string;

public class CBString01 {
	
	//concat two string, omit double char
	public static String concat(String a, String b) {
		String c1 = "";
		if(a.length() > 0 && b.length() > 0) {
			if(a.charAt(a.length()-1) == b.charAt(0)) {
				c1 = a.substring(0, a.length()-1).concat(b);
				return c1;
			}
			c1 = a + b;
		}
		else if(a.length() == 0) {
			return b;
		}
		else if(b.length() == 0) {
			return a;
		}
		return c1;
	}
	
	//swap last two chars
	public static String lastTwo(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return str;
		}
		else if(str.length() > 1) {
			String first = str.substring(0, str.length()-2);
			String last = str.substring(str.length()-1);
			String secLast = str.substring(str.length()-2, str.length()-1);
			str = first + last + secLast;
			return str;
		}
		return str;
	}
	//Given a string, if the string begins with "red" or 
	//"blue" return that color string, otherwise return the empty string.
	public static String seeColor(String str) {
		if(str.length() > 3) {
			if(str.substring(0, 3).equals("red")) {
				return "red";
			}
			else if(str.substring(0, 4).equals("blue")) {
				return "blue";
			}
		}
		if(str.length() == 3) {
			if(str.substring(0, 3).equals("red")) {
				return "red";
			}
		}
		return "";
	}
	
	//return true if first 2 chars appear at the end
	public static boolean frontAgain(String str) {
		if(str.length() >= 2) {
			return str.substring(0, 2).equals(str.substring(str.length()-2, str.length()));
		}
		return false;
	}
	
	//return a string made of 3 copies of first 2 chars
	public static String extraFront(String str) {
		if(str.length() >= 2) {
			String sub = str.substring(0, 2);
			return sub + sub + sub;
		}
		else 
			return str+str+str;
	}
	
	//if string has same substring at front and back return the substring
	public static String without2(String str) {
		if(str.length() > 2) {
			if(str.substring(0,2).equals(str.substring(str.length()-2, str.length()))) {
				return str.substring(2, str.length());
			}
		}
		else if(str.length() == 2) {
			return "";
		}
		return str;
		}
	
	//return a version without first two chars. keep first char if it is 'a' and
	//keep second char if it is 'b'
	public static String deFront(String str) {
		if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
			return str;
		}
		if(str.charAt(0) == 'a' && str.charAt(1) != 'b') {
			return str.substring(0,1) + str.substring(2, str.length());
		}
		if(str.charAt(0) != 'a' && str.charAt(1) == 'b') {
			return str.substring(1,str.length());
		}
		return str.substring(2,str.length());
	}
	
	//return the substring if word appears at front
	public static String startWord(String str, String word) {
		if(str.length() < word.length()) {
			return "";
		}
		if(str.substring(0, word.length()).contains(word.substring(1, word.length()))) {
			return str.substring(0, word.length());
		}
		return "";
	}
	
	//if first or last char is x return without x
	//else return unchanged
	public static String withoutX(String str) {
		if(str.length() == 0) {
			return "";
		}
		if(str.length() > 1 &&str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x') {
			return str.substring(1, str.length()-1);
		}
		if(str.charAt(0) == 'x') {
			return str.substring(1, str.length());
		}
		if(str.charAt(str.length()-1) == 'x') {
			return str.substring(0, str.length()-1);
		}
		if(str.length() == 1 && str.charAt(0) == 'x') {
			return "";
		}
		return str;
	}
	
	
	//if one or both of first two chars is x, return without them
	//else return string unchanged
	public static String withoutX2(String str) {
		if(str.length() == 1 && !str.contains("x")) {
			return str;
		}
		if(str.length() == 1 && str.contains("x")) {
			return "";
		}
		if(str.length() == 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
			return "";
		}
		if(str.length() > 1) {
			if(str.charAt(0) == 'x' && str.charAt(1) != 'x') {
				return str.substring(1, str.length());
			}
			if(str.charAt(0) != 'x' && str.charAt(1) == 'x') {
				return str.substring(0, 1) + str.substring(2, str.length());
				}
			if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
				return str.substring(2, str.length());
				}
			}
		return str;
	}
	
	//given a string and int n return first and last n. string length will be 
	//at least n
	public static String nTwice(String str, int n) {
		if(str.length() >= n) {
			return str.substring(0, n) + str.substring(str.length()-n, str.length());
		}
		return str;
	}
	
	//given a string return true if it ends in ly
	public static boolean endsLy(String str) {
		if(str.length() < 2) {
			return false;
		}
		if(str.length() >= 2 && str.substring(str.length()-2, str.length()).equals("ly")) {
			return true;
		}
		return false;
	}
	
	
	//given a string of even length return middle 2
	public static String middleTwo(String str) {
		if(str.length() > 2) {
			return str.substring(str.length()/2-1, str.length()/2 + 1);
		}
		return str;
	}
	
	//return a string without first and last char
	public static String withoutEnd2(String str) {
		if(str.length()==0 || str.length()==1 || str.length()==2) {
			return "";
		}
		return str.substring(1, str.length()-1);
	}
	
	//return string 1 from fron if front is true
	//if front is false return string 1 from back
	public static String theEnd(String str, boolean front) {
		if(front) {
			return str.substring(0,1);
		}
		return str.substring(str.length()-1, str.length());
	}
	
	//rotate last 2 chars to front
	public static String right2(String str) {
		if(str.length()==2) {
			return str;
		}
		return str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2);
	}
	
	//roatated left
	public static String left2(String str) {
		if(str.length() == 2) {
			return str;
		}
		return str.substring(2, str.length()) + str.substring(0, 2);
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "red";
		String r1 = right2("abc");
		System.out.println(r1);
	}

}
