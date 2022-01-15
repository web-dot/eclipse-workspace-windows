import java.io.PrintStream;

public class Warmup01 {
	
	//Given two int values, return their sum. Unless the two values are the same, then return double their sum
	public static int sumDouble(int a, int b) {
		if(a == b) {
			return 2 * (a + b);
		}
		else {
			return a + b;
		}
	}
	//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	public static int diff21(int n) {
		int diff = 0;
		if(n > 21) {
			diff = 2 * (Math.abs(n - 21));
		}
		else {
			diff = Math.abs(n - 21);
		}
		return diff;
	}
	////talking parrot
	public static boolean parrotTrouble(boolean talking, int hour) {
		  if((hour < 7 || hour > 20) && talking == true) {
			  return true;
		  }
		  return false;
	}
	//
	//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10
	public static boolean makes10(int a, int b) {
		  if(a == 10 || b == 10 || (a + b) == 10) {
			  return true;
		  }
		  return false;
	}
	
	//
	public static boolean posNeg(int a, int b, boolean negative) {
		  if((negative == true && (a < 0 && b < 0))) {
			  return true;
		  }
		  if((negative == false && (a < 0 && b > 0)) || (negative == false && (a > 0 && b < 0))) {
			  return true;
		  }
		  return false;
	}
	
	//string with not
	
	public static String notString(String str) {
		if(str.length() == 1 || str.length() == 2) {
			return "not " + str;
		}
		if(str.substring(0, 3).equals("not")) {
			return str;
		}
		else {
			str =  "not " + str;
		}
		return str;
	}
	/*
	public static String notString(String str) {
		return	str.substring(0, 3).equals("not") ? str : "not " + str;	
	}
	*/
	//remove char at n
	public static String missingChar(String str, int n) {
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(n);
		return sb.toString();
	}
	//Given a string, return a new string where the first and last chars have been exchanged.
	public static String frontBack(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length() == 1 || str.length() == 0) {
			return str;
		}
		else {
		sb.append(str.charAt(str.length()-1));
		for(int i = 1; i < str.length() - 1; i++) {
			sb.append(str.charAt(i));
		}
		sb.append(str.charAt(0));
		}
		return sb.toString();
	}
	//front 3
	public static String front3(String str) {
		if(str.length() > 2) {
			String strSub = str.substring(0, 3);
			str = strSub + strSub + strSub;
			return str;
		}
		return str + str + str;
	}
	//backAround
	public static String backAround(String str) {
		String strSub = str.substring(str.length()-1);
		str = strSub + str + strSub;
		return str;
	}
	
	//or35
	public static boolean or35(int n) {
		if(n % 3 == 0 || n % 5 == 0) {
			return true;
		}
		return false;
	}
	//front22
	public static String front22(String str) {
		if(str.equals("")) {
			return str;
		}
		if(str.length() == 1) {
			str = str + str + str;
			return str;
		}
		else {
		String sub = str.substring(0, 2);
		str = sub + str + sub;
		return str;
		}
	}
	
	public static void main(String[] args) {
		boolean r = or35(45);
		System.out.println(r);
	}

}
