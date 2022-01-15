import java.util.*;

public class CodeEvalRe01 {
	//Q.45-Given a string, return a new string where the last 3 chars are now in upper case. 
	//If the string has less than 3 chars, uppercase whatever is there. 
	//Note that str.toUpperCase() returns the uppercase version of a string.
	/*
	public static String endUp(String str) {
		if(str.length() < 3) {
			str = str.toUpperCase();
		}
		else if(str.length() >= 3) {
			String sub = str.substring(str.length()-3, str.length());
			System.out.println(sub);
			String repSub = sub.toUpperCase();
			str = str.replace(sub, repSub);
		}
		return str;
	}*/
	
	//
	public static String endUp(String str) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			count++;
			if(count <= str.length()-3) {
				sb.append(c);
			}
			if(count > str.length()-3) {
				sb.append(Character.toUpperCase(c));
			}
		}
		return sb.toString();
	}
	
	//Q.45-Given a string, return a version without both the first and last char of the string. 
	//The strings will be at least length 3.
	public static String withoutEnd(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < str.length()-1; i++) {
			char c = str.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	
	////Q.46-Given a string and an index, return a string length 2 starting at the given index. 
	//If the index is too big or too small to define a string length 2, use the first 2 chars. 
	//The string length will be at least 2.
	public static String twoChar(String str, int index) {
		if(index > str.length() || index < 0) {
			str = str.substring(0, 2);
		}
		else {
			str = str.substring(index, index+2);
		}
		return str;	
	}
	
	//Q.48-Given two strings, a and b, return the result of putting them together in the order 'abba', e.g.
	//"Hi" and "Bye" returns "HiByeByeHi".
	public static String makeAbba(String a, String b) {
		String str = a+b+b+a;
		return str;
	}
	
	//Q.49-Given a string and a second "word" string, we'll say that the word matches the 
	//string if it appears at the front of the string, except its first char does not need 
	//to match exactly. On a match, return the front of the string, or otherwise return the 
	//original string. So, with the string "hippo" the word "hi" returns "hi" and "hip" 
	//returns "hip". The word will be at least length 1.
	public static String startWord(String str, String word) {
		String strSub = str.substring(1,word.length());
		String wrdSub = word.substring(1, word.length());
		if(strSub.equals(wrdSub)) {
			str = str.substring(0, word.length());
		}
		return str;
	}
	//Q.54- Given a string, return a string 
	//length 1 from its front, unless front 
	//is false, in which case return a string 
	//length 1 from its back. The string will 
	//be non-empty.
	public static String theEnd(String str, boolean front) {
		if(front) {
		str = str.substring(0,1);		
		}
		else {
			str = str.substring(str.length()-1, str.length());		
		}
		return str;
	}
	
	//Q.55-Given a string, if the string "del" appears 
	//starting at index 1, return a string where that 
	//"del" has been deleted. Otherwise, return the 
	//string unchanged
	public static String delDel(String str) {
		String sub = str.substring(1, 4);
		String newStr = "";
		if(sub.equals("del")) {
			//System.out.println("true");
			newStr = str.substring(0, 1) + str.substring(3, str.length());
		}
		else
			newStr = str;
	return newStr;
	}
	
	//Q.56- Given a string of odd length, return the string length 3 
	//from its middle, so "Candy" yields "and". The string length
	//will be at least 3.
	public static String middleThree(String str) {
		//System.out.println(str.length()/2);
		int len = str.length()/2;
		str = str.substring(len-1, len+2);
		return str;
	}
	//Q.61-Given a string, return a string length 2 made of 
	//its first 2 chars. If the string length is less than 2, 
	//use '@' for the missing chars.
	public static String stFirst(String str) {
		if(str.length() > 2) {
			return str.substring(0,2);
		}
		return str.substring(0,1) + "@";
	}
	
	
	//Q.62-Check if string has all unique 
	//characters(considering white spaces and case sensitivity).
	//Eg: i/p : reghav o/p : true i/p : raghav o/p : false
	
	public static boolean isStringUnique(String str) {
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for(int j = i+1; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Q.63-Perform basic string compression using counts of repeated 
	//characters. (If the compressed string is larger than or equal 
	//to the orginal string(in length) then the original string 
	//should be returned) Eg: i/p : aaaaccccbbbhhhjj o/p : a4c4b3h3j2
	public static String compressString(String str) {
		int[] ca = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			ca[c-'a']++;
		}
		//System.out.println(Arrays.toString(ca));
		String newString = "";
		for(int i = 0; i < ca.length; i++) {
			if(ca[i] >= 1) {
			newString = newString + (char)(i + 'a') + Integer.toString(ca[i]);
			}
		}
		return newString;
	}
	
	//Q.64- Pass two Strings. Check whether the second String is 
	//rotated form of the first String.
	public static boolean isStringRotated(String str1 , String str2) {
		 StringBuilder sb = new StringBuilder(str2);
		 //System.out.println(sb.reverse());
		 sb = sb.reverse();
		 return str1.equals(sb.toString());
	}
	
	//Q.66-Accept a string as input. The method should return a 
	//string which does not contain any repeating characters.
	public static String getAsUnique(String str) {
		int[] ca = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			ca[c-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < ca.length; j++) {
			if(ca[j] == 1) {
				sb.append("" + (char)(j + 'a'));
			}
		}
		return sb.toString();
	}
	public static String getAsUnique2(String str) {
		List<Character> chars = new ArrayList<Character>();
		String s2 = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
				if(!chars.contains(c)){
					chars.add(c);			
					}
			}
			for(Character c : chars) {
				s2 = s2 + c;
			}
		//return "wait";
		return s2;
	}
	//Q.68-Pass a string as parameter. Convert the string characters to 
	//lowercase if it is uppercase and to uppercase if its lowercase. 
	//If there are digits or special chars in the string, they should be 
	//omitted
	public static String convertCase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c)) {
			sb.append(Character.toLowerCase(c));
			}
		}
		return sb.toString();
	}
	
	//Q.73-Given a non-empty string and an int N, return the string made 
	//starting with char 0, and then every N th char of the string. So if N is 3, 
	//use char 0, 3, 6, ... and so on. N is 1 or more.
	public static String everyNth(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i+=n) {
			//System.out.println(str.charAt(i));
			char c = str.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	//Q.84- Pass a string as parameter and return a boolean to indicate whether 
	//the string passed is a boolean or not
	public static boolean isBoolean(String str) {
		if(str.equals("true") || str.equals("false")) {
			return true;
		}
		return false;
	}
	
	//Q.86-Accept a string as parameter. Find out how many digits are present in the string.
	
	public static int countNumDigits(String str) {
		char[] ca = str.toCharArray();
		int count = 0;
		//System.out.println(Arrays.toString(ca));
		for(int i = 0; i < ca.length; i++) {
			if(Character.isDigit(ca[i])) {
				count++;
			}
		}
		return count;
	}
	
	//Q.87- Pass a string as parameter. Reverse the string and return it.
	//All the alphabets in the strings should be individually reversed and then returned.
	public static String reverseString(String str) {
		char[] ca = str.toCharArray();
		for(int i = 0; i < ca.length/2; i++) {
			//char c = str.charAt(i);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[ca.length-i-1] = (char)(ca[i] ^ ca[ca.length-i-1]);
			ca[i] = (char)(ca[i] ^ ca[ca.length-i-1]);
		}
		return new String(ca);
	}
	//Q.88- Pass a string as parameter.Return a new string which contains 
	//the passed strings Characters in a sorted manner(Ascending).
	public static String sortString(String str) {
		List<String> list = new ArrayList<String>();
		String[] arr = str.split("");
		for(String s : arr) {
			list.add(s);
		}
		Collections.sort(list);
		String newStr = "";
		for(String listStr : list) {
			newStr = newStr + listStr;
		}
		return newStr;
	}
	
	//Q.90-Pass two strings.Check one is the permutation of the other. 
	//Case sensitivity and white space should be considered. First you check 
	//the lengths (n), if they are not same, they cannot be permutations of each other.
	//The frequency of each character in the first string should be same as the second String.
	//Then only you can say that the string1 is a permutation of the other 
	//eg: i/p o/p uttara,rutata - true uttara,rutrta - false java, Ja va - false
	public static boolean isStringPermute(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] s1a = new int[26];
		//int[] s2a = new int[26];
		for(int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			s1a[c1 - 'a']++;
			s1a[c2 - 'a']++;
		}
		for(int j = 0; j < s1a.length; j++) {
			if(s1a[j] >= 2 && s1a[j] % 2 == 0) {
				return true;
			}
		}
		return false;
	}
	//Q.92- Given a string, take the last char and return a new string with the 
	//last char added at the front and back, so "cat" yields "tcatt". The original string 
	//will be length 1 or more. backAround("cat")-->tcatt , backAround("Hello")-->oHelloo , 
	//backAround("a")-->aaa
	public static String backAround(String str) {
		System.out.println(str.substring(str.length()-1, str.length()));
		String sub = str.substring(str.length()-1, str.length());
		str = sub + str + sub;
		return str;
	}
	
	//Q.94-Given a string name, e.g. "Bob", return a greeting of the 
	//form "Hello Bob!". helloName("Bob")-->"Hello Bob!" , helloName("Alice")-->"Hello Alice!" , 
	//helloName("X")-->"Hello X!"
	public static String helloName(String str) {
		return "Hello " + str;
	}
	
	//Q.96-Given a string, if the string begins with "red" or "blue" return that 
	//color string, otherwise return the original string. seeColor("redxx")-->"red" , 
	//seeColor("xxred")-->"xxred " , seeColor("blueTimes")-->"blue"
	public static String seeColor(String str) {
		if(str.substring(0, 3).equals("red")) {
			return "red";
		}
		else if(str.substring(0, 4).equals("blue")) {
			return "blue";
		}
		return str;
	}
	
	//Q.97-Given a string, return true if the string starts with "hi" and false otherwise. 
	//startHi("hi there")--> true , startHi("hi")--> true , startHi("hello hi")--> false
	public static boolean startHi(String str) {
		if(str.substring(0, 2).equals("hi")) {
			return true;
		}
		return false;
	}
	
	//Q.100-Pass 2 strings as input. Find out how many times does the second 
	//param occur in the first one (number of occurances) and return the count.
	public static int findNumberOfOccurances(String s1, String s2) {
		int pos = 0;
		int count = 0;
		while((pos = s1.indexOf(s2, pos)) != -1) {
			++count;
			++pos;
		}
		return count;
	}
	//Q.101- Given a string, we'll say that the front is the 
	//first 3 chars of the string. If the string length is less than 3, 
	//the front is whatever is there. Return a new string which is 3 
	//copies of the front. front3("Java") --> "JavJavJav" , 
	//front3("Chocolate") -->"ChoChoCho" , front3("abc") -->"abcabcabc"
	public static String frontThree(String str) {
		if(str.length() < 3) {
			return str;
		}
		return str.substring(0, 3);
	}
	
	
	//Q.106-Given two strings, append them together 
	//( known as "concatenation" ) and return the result. 
	//However, if the strings are different lengths, 
	//omit chars from the longer string so it is the same 
	//length as the shorter string. So "Hello" and "Hi" yield "loHi". 
	//The strings may be any length.
	public static String minCat(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		String str = "";
		if(l2 < l1) {
			String sub1 = s1.substring(l1-l2, l1);
			System.out.println(str);
			str = sub1 + s2;
		}
		if(l1 < l2) {
			String sub2 = s2.substring(l2-l1, l2);
			str = sub2 + s1;
		}
		return str;
	}
	//Q.100-Pass an array of strings and an int as parameters. 
	//Remove all strings which has length equal to or greater 
	//than the int that is passed from the array and return the
	//array
	public static String[] filterStringArr(String[] s, int len) {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length; i++) {
			if(s[i].length() < len) {
				list.add(s[i]);
			}
		}
		String[] narr = new String[list.size()];
		int k = 0;
		for(int i = 0; i < list.size(); i++) {
			narr[k] = list.get(i);
			k++;
		}
		return narr;
	}
	
	//Q.103-Given a string, return a new string made of 3 
	//copies of the first 2 chars of the original string. 
	//The string may be any length. If there are fewer than 
	//2 chars, use whatever is there.
	public static String extraFront(String str) {
		for(int i = 0; i < 3; i++) {
			str = str.substring(0,2);
		}
		return str + str + str;
		
	}
	
	//Q.46-Given a string and an index, return a 
	//string length 2 starting at the given index. 
	//If the index is too big or too small to define 
	//a string length 2, use the first 2 chars. The 
	//string length will be at least 2.
	public static String twoChar2(String str , int index) {
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split("");
		if(index < str.length()) {
		for(int i = index; i < index+2; i++) {
			sb.append(arr[i]);
			}
		return sb.toString();
		}
		return str.substring(0, 2);
	}
	//Q.45-Given a string, return a version without both the 
	//first and last char of the string. The strings will be
	//at least length 3.
	public static String withoutEnd2(String str) {
		
		for(int i = 0; i < str.length(); i++) {
		str = str.replace(str.charAt(0) , ' ').replace((str.charAt(str.length()-1)), ' ');
		//str.trim();
		}
		return str.trim();
	}
	
	//Q.40- Given a string of even length, return a string made 
	//of the middle two chars, so the string "string" yields "ri".
	//The string length will be at least 4.
	
	public static String middleTwo(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1; i++) {
			//System.out.println(str.charAt(str.length()/2));
			sb.append((str.charAt((str.length() + 1)/2 - 1)));
			sb.append(str.charAt((str.length() + 1)/2));
			//sb.append((str.charAt((str.length() + 1)/2 - 1)));
		}
		return sb.toString();
	}
	//Q.35- Given a string, if the first or last chars are 'x', 
	//return the string without those 'x' chars, and otherwise 
	//return the string unchanged.
	
	
	
	
	public static void main(String[] args) {
					
		String r =  middleTwo("rest");
		System.out.println(r);
		
		
		//EVEN A DIFFERENT REFERNCE IS PASSED TO remove(), it will
		//remove based on STATE
		/*
		List<String> li = new ArrayList<String>();
		String r1 = "dog";
		String r2 = "cat";
		li.add(r1);
		li.add(r2);
		System.out.println(li);
		String r3 = new String("dog");
		li.remove(r3);
		System.out.println(li);
		String s4 = new String("cat");
		System.out.println(li.contains(s4)); 
		*/

	}

}
