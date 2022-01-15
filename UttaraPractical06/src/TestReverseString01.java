import java.util.Arrays;

public class TestReverseString01 {
	
	
	//reverse string meethods
	
	//using xor
	public static String reverseString01(String str) {
		char[] sa = str.toCharArray();
		for(int i = 0; i < str.length()/2; i++) {
			//System.out.println(sa[i]);
			sa[i] = (char)(sa[i] ^ sa[str.length()-i-1]);
			sa[str.length()-i-1] = (char)(sa[i] ^ sa[str.length()-i-1]);
			sa[i] = (char)(sa[i] ^ sa[str.length()-i-1]);
		}
		return new String(sa);
	}
	//using StringBuilder
	public static String reverseString02(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	//using concat
	public static String reverseString03(String str) {
		//char[] sa = str.toCharArray();
		String s1 = "";
		for(int i = str.length(); i > 0; i--) {
			String s = str.substring(i-1, i);
			s1 = s1.concat(s);
		}
		return s1;
	}
	
	
	//check palindrome using reverse method
public static boolean chekPalindrome(String str) {
		
		
		String sub1 = str.substring(0, str.length()/2);
		if(str.length() > 1 && str.length() % 2 == 1) {
			String sub2 = reverseString01(str.substring(str.length()/2+1, str.length()));
			if(sub1.equals(sub2)) {
				return true;
			}
		}
		else if(str.length() > 1 && str.length() % 2 == 0) {
			String sub2 = reverseString01(str.substring(str.length()/2, str.length()));
			if(sub1.equals(sub2)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("reverse string------->");
		String s1 = reverseString01("hello");
		System.out.println(s1);
		
		String s2 = reverseString02("programming");
		System.out.println(s2);
		
		String s3 = reverseString03("wait");
		System.out.println(s3);
		
		System.out.println();
		System.out.println("palindrome----->");
		
		
		//palindrome using reverse method
		boolean s4 = chekPalindrome("madam");
		boolean s5 = chekPalindrome("noon");
		boolean s6 = chekPalindrome("n");
		boolean s7 = chekPalindrome("nn");
		boolean s8 = chekPalindrome("");
		
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		
		System.out.println();
		System.out.println();
		
		//reverse each word in a senetence;
		
		String str = "Little lambs eat ivy A kid will eat ivy too";
		
		String[] sa = str.split(" ");
		String newString = "";
		for(String word : sa) {
			word = reverseString03(word);
			newString = newString + word + " ";
		}
		
		System.out.println(newString);
		
		
		
		
		
		
		
		
		
		
	}

}
