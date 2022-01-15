import java.util.List;
import java.util.ArrayList;


public class CodeEval6 {
	
	//Q.115- Pass 2 strings as input. Find out how many times does the second param occur in the first one (number of occurances) and return the count.
	public static int findNumOfOccurances(String input,String matcher) {
		int count = 0;
		int pos = 0;
		while((pos = (input.indexOf(matcher, pos))) != -1) {
			count++;
			pos++;
		}
		return count;
	}
	
	//Q.116-Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given 
	//length are omitted.
	public static ArrayList<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> sa = new ArrayList<String>();
		for(String word : words) {
			if(word.length() != len) {
				sa.add(word);
			}
		}
		return sa;
	}
	
	//Q.117-When squirrels get together for a party, they 
	//like to have cigars. A squirrel party is successful 
	//when the number of cigars is between 40 and 60, 
	//inclusive. Unless it is the weekend, in which case 
	//there is no upper bound on the number of cigars.
	//Return true if the party with the given values is 
	//successful, or false otherwise.
	public static boolean cigarParty(int cigars, boolean isWeekend)
	{
	  if(isWeekend && cigars >= 40 ) {
		return true;
	  }
	  else if(cigars >= 40 && cigars <= 60) {
		  return true;
	  }
	  r	eturn false;
	}
	
	//Q.118-Given two ints, each in the range 10..99, 
	//return true if there is a digit that appears in 
	//both numbers, such as the 2 in 12 and 23. 
	//(Note: division, e.g. n/10, gives the left digit 
	//while the % "mod" n%10 gives the right digit.)
	public static boolean shareDigit(int a, int b)
	{
	  if((a/10 == b/10 || a/10 == b%10) || (a%10 == b/10 || a%10 == b%10)) {
		  return true;
	  }
	  return false;
	}
	
	//Q.119-Return the number of times that the string "code" appears 
	//anywhere in the given string, except we'll accept any letter for 
	//the 'd', so "cope" and "cooe" count.
	public static int countCode(String str) {
		 String test = "co";
		 int count = 0;
		 int pos = 0;
		 while((pos = str.indexOf(test, pos)) != -1) {
			 pos++;
			 if(str.substring(pos+2, pos+3).equals("e")) {
				 count++;
				 //pos++;
				 //System.out.println(pos);
				 //System.out.println(str.substring(pos+2, pos+3));
			 }
		 }
		 return count;
	}
	
	//Q.120-Given three ints, a b c, one of them is small, one is medium
	//and one is large. Return true if the three values are evenly spaced,
	//so the difference between small and medium is the same as the 
	//difference between medium and large.
	public static boolean evenlySpaced(int a, int b, int c)
	{
	  return c-b == b-a || b-a == a-c;
	}
	//Q.121-Given a non-empty string like "Code" return a string like "CCoCodCode".
	public static String stringSplosion(String str) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		  for(int i = 0; i < str.length(); i++) {
			  sb1 = sb1.append(str.charAt(i));
			  sb2 = sb2.append(sb1);
			  System.out.println(sb2);
		  }
		  return sb2.toString();
	}
	
	//Q.122- Given a string, return a string where for every char in
	//the original, there are two chars.
	public static String doubleChar(String str) {
		StringBuilder sb = new StringBuilder();
		 for(int i = 0; i < str.length(); i++) {
			 sb.append(str.charAt(i)).append(str.charAt(i));
			 //System.out.println(sb);
		 }
		 return sb.toString();
	}
	//Q.123-We want make a package of goal kilos of chocolate. 
	//We have small bars (1 kilo each) and big bars (5 kilos each). 
	//Return the number of small bars to use, assuming we always 
	//use big bars before small bars. Return -1 if it can't be done.
	public static int makeChocolate(int small, int big, int goal) 
	{
		int b = goal % (big*5);
		System.out.println(b);
		int s = small*1;
		System.out.println(s);
		if((b > 0) && (b % s >= 0) && ((b / s) >= 1)) {
			return b;
		}
		return -1;
	}
	
	//Q.124-Look for patterns like "zip" and "zap" in the string -- 
	//length-3, starting with 'z' and ending with 'p'. Return a 
	//string where for all such words, the middle letter is gone, 
	//so "zipXzap" yields "zpXzp".
	public static String zipZap(String str) {
		StringBuilder sb = new StringBuilder();
		 String test = "z";
		 int pos = 0;
		 //System.out.println(str.charAt(str.length() / 2));
		 while((pos = (str.indexOf(test, pos))) != -1) {
			 pos++;
			 sb.append(test);
			 if(str.substring(pos+1, pos+2).equals("p")) {
				 pos++;
				 sb.append("p");
			
			 	}
			 sb.append(str.charAt(str.length() / 2));
		 	}
		 return sb.toString();
	}
	public static String zipZap2(String str) {
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if() {
				str = str.replace(str.charAt(c+2), ' ');
			}
		}
		return str;
	}
	
	//Q.125-Given a string, return a version 
	//without the first 2 chars. Except keep 
	//the first char if it is 'a' and keep the 
	//second char if it is 'b'. The string may 
	//be any length.
	public static String deFront(String str) {
		if(str.substring(1,2).equals("b") && str.substring(0,1).equals("a")) {
			str = str.substring(0, str.length());
		}
		else if(str.substring(0,1).equals("a")) {
			str = str.substring(0,1) + str.substring(2, str.length());
			}
		else if(str.substring(1,2).equals("b")) {
			str = str.substring(1,2) + str.substring(2, str.length());
		}
		else
			str =  str.substring(2, str.length());
		return str;
	}
	
	//Q.126-Given a String .Find out the word which contains maximum repeated 
	//consecutive chars in the entire String
	public static String maximumConsecutivechar(String str){
		int count = 0;
		String maxWord = "";
		int maxCount = 0;
		String[] sa = str.split(" ");
		for(String word : sa) {
			System.out.println(word);
		for(int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i) == word.charAt(i+1)) {
 			for(int j = 0; j < word.length(); j++) {
				if(Character.compare(str.charAt(i), str.charAt(j)) == 0){
					count++;
					System.out.println(count);
							}
						}
					}
				}
		if(count > maxCount) {
			maxCount = count;
			maxWord = word;
			}
		count = 0;
		}
		return maxWord;
	}
	

	

	
	public static void main(String[] args) {
		
		//String r = maximumConsecutivechar("analysis and design pattern");
		//System.out.println(r);
		
		/*
		String str = "pattern";
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					System.out.println(str);
					continue;
				}
			}
		}*/
		
		//Boolean test = new Boolean(true);
		//System.out.println(test);
		
		int a = 3;
		Integer y = a;
	System.out.println(y);

	}

}









