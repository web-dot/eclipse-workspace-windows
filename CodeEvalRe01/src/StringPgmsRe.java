
public class StringPgmsRe {
	//1) Take string inputs from arg[0], arg[1]. Find the number 
	//of occurrences of arg[1] in arg[0] and print it out.
	public static int strOcc(String s1, String s2) {
		int count = 0; 
		int pos = 0;
		while((pos = (s1.indexOf(s2, pos))) != -1) {
			count++;
			pos++;
		}
		return count;
	}
	
	//Take any number of strings as input from command line. 
	//Concat all of them and print them out.
	public static String concatStrings(String s) {
		String[] sa = s.split(" ");
		String newStr = " ";
		for(String word : sa) {
			newStr = newStr + word;
		}
		return newStr;
	}
	
	//CODE EVAL PAGE 1
	
	//Given a string, return a new string where the first and last 
	//chars have been exchanged. frontBack("code") -> "eodc" , 
	//frontBack("a") -> "a" , frontBack("ab")-> "ba" , 
	//frontBack("PrograM")-> "MrograP" ,
	public static String frontBack(String str) {
		StringBuilder sb = new StringBuilder();
		char toBack = str.charAt(0);
		char toFront = str.charAt(str.length()-1);
		sb.append(toFront);
		if(str.length() > 1) {
		for(int i = 1; i < str.length()-1; i++) {
			char c = str.charAt(i);
			sb.append(c);
			}
		sb.append(toBack);
		}
		return sb.toString();
	}
	
	//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	public static String firstHalf(String str) {
		str = str.substring(0, str.length()/2);
		return str;
	}
	
	//Return true if the given string contains 1 or 3 'e' chars. Otherwise return false
	public static boolean stringE(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e') {
				count++;
			}
		}
		if(count == 1 || count == 3) {
			return true;
		}
		return false;
	}
	
	
	//Given a string and an int n, return a string made of 
	//the first and last ' n' chars from the string. 
	//The string length will be at least n.
	public static String nTwice(String str, int n) {
		if(str.length() > 1) {
		String s1 = str.substring(0, n);
		String s2 = str.substring(str.length() - n, str.length());
		return s1 + s2;
		}
		return str;
	}
	//Find number of consonents and vowels
	public static void countVowelsCons() {
		int vCount = 0;
		int cCount = 0;
		String str = "This is a really simple sentence";
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
				vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
			
		}
		System.out.println("number of vowels = " + vCount);
		System.out.println("number of consonents = " + cCount);
				
	}
	
	//Q.7-Accept a string as parameter. Find out how many consonants present in it.
	public static int countConsonents(String s) {
		int count = 0;
		for(int i = 0; i< s.length(); i++) {
			char c = s.charAt(i);
			if((c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')) {
				//System.out.println(c);
				count++;
				}
			}
		return count;
		}
	
	//Q.10-Given a string, return a new string where the first and last chars have been exchanged. frontBack("code") -> "eodc" , 
	//frontBack("a") -> "a" , frontBack("ab")-> "ba" , frontBack("PrograM")-> "MrograP" ,
	/*
	public static String frontBack(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(s.length()));
		for(int i = 1; i < s.length()-1; i++) {
			sb.append(s.charAt(i));
		}
		sb.append(s.charAt(0));
		return sb.toString();
	}
	*/
	
	//Q.13-Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	public static String firstHalf2(String str) {
		str = str.substring(0, str.length()/2);
		return str;
	}
	
	//14.Given a string, return a new string where the first and last chars have been exchanged. 
	//frontBack("code") -> "eodc" , frontBack("a") -> "a" , frontBack("ab")-> "ba" , frontBack("PrograM")-> "MrograP" ,
	public static String exchangeIni(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(str.length()-1));
		for(int i = 1; i < str.length()-1; i++) {
			sb.append(str.charAt(i));
		}
		sb.append(str.charAt(0));
		return sb.toString();
	}
	//15-Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	public static String returnHalf(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length()/2; i++) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	//Q.16-Return true if the given string contains 1 or 3 'e' chars. Otherwise return false.
	public static boolean returnCount(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'e') {
				count = count + 1;
			}
		}
		if(count == 1 || count == 3) {
			return true;
		}
		return false;
	}
	//Q.18-Given a string and an int n, return a string made of the first and last ' n' chars from the string. 
	//The string length will be at least n.
	public static String makeStringFrom(String str, int n) {
		str = str.substring(0, 3) + str.substring(str.length()-3, str.length());
		return str;
	}
	
	//every other char in string
	public static String stringBits(String str) 
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i+=2) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	
	//given a string return true if it ends with ly
	public static boolean endsLy(String str) {
		if(str.substring(str.length()-2, str.length()).equals("ly")) {
			return true;
		}
		return false;
	}
	
	
	//Q.33-Given a string, return a string made of the chars at 
	//indexes 0,1,4,5,8,9 ... so "kittens" yields "kien".
	
	public static String altPairs(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i+=4) {
			sb.append(str.charAt(i));
			System.out.println("->" + str.charAt(i));
			if(i+1 < str.length()) {
				sb.append(str.charAt(i+1));
				System.out.println(str.charAt(i+1));
				
			}
		}
		return sb.toString();
	}

	
	//Q.34-Given a string of any length, return a 
	//new string where the last 2 chars, if present, 
	//are swapped, so "coding" yields "codign".
	public static String lastTwo(String str) {
		 char[] ca = str.toCharArray();
		 char temp = ca[ca.length-2];
		 ca[ca.length-2] = ca[ca.length-1];
		 ca[ca.length-1] = temp;
		 str = String.valueOf(ca);
		  return str;
	}

	//Given a string, if the first or last chars are 'x', 
	//return the string without those 'x' chars, and otherwise 
	//return the string unchanged.
	public static String withoutX(String str) {  
		char[] ca = str.toCharArray();
		if(ca[0] == 'x' && ca[ca.length-1] == 'x') {
			str = str.substring(1, str.length()-1);
		}
		else if(ca[0] == 'x') {
			str = str.substring(1);
		}
		else if(ca[ca.length-1] == 'x') {
			str = str.substring(0, str.length()-1);
		}
		return str;
	}

	public static void main(String[] args) {
		
		//System.out.println(endsLy("finally"));
		//. .     . .
		//0 1 2 3 4 5 6
		//k i t t e n s
									//prraer	
		//System.out.println(altPairs("programmer"));
		//System.out.println(lastTwo("hello")); 
		
		System.out.println(withoutX("Javax"));
		
		
	}
}














