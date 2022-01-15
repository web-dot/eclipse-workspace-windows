import java.util.Arrays;

public class StringMethods02 {

	//return unique chars
	//below method only works for input space of lower-case characters
	//will return undesired value or will throw an exception for upper-case character or other character
	//needs REFACTORING for uppercase characters------------>
	
	public static char[] returnUnique(String str) {
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c - 'a']++;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		char[] uniqueCharArr = new char[5];
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				uniqueCharArr[k] = (char)(i + 'a');
				k++;
			}
		}
		return uniqueCharArr;
	}
	
	
	//compress method
	public static String encodeString(String str) {
		int[] ca = new int[26];
		for(int i = 0; i < str.length()-1; i++) {
			char c = str.charAt(i);
			ca[c - 'a']++;
		}
		String en = "";
		for(int i = 0; i < ca.length; i++) {
			if(ca[i] > 0) {
			en = en + (char)(i + 'a') + ca[i];
			}
		}
		System.out.println();
		return en;
	}
	
	public static void main(String[] args) {
		
		//return unique chars
		char[] ca1 = returnUnique("insomniacprogrammer");
		char[] ca2 = returnUnique("abcabd");
		char[] ca3 = returnUnique("java");
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(ca3);
		
		
		
		System.out.println();
		//encoding string
		
		String s1 = encodeString("xxxxxxxgggggggggmmckkkllxx\"");
		System.out.println(s1);
		
		
		
	}

}
