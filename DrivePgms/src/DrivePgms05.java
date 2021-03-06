
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class DrivePgms05 {

	//addition of digit present in number
	public static int addDigits()throws IOException {
		System.out.println("enter a number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
	
	
	//sort a string
	public static String sortStringUsingLib(String str) {
		char[] ca = str.toCharArray();
		Arrays.sort(ca);
		return new String(ca);
	}
	
	
	public static String sortStringNoLib(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		//remove white-spaces between words
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			//if character is a letter then append(will not append whites-paces)
			if(Character.isLetter(c)){
				sb.append(c);
			}
		}
		//convert from sb to String
		String s = sb.toString();
		//convert from String to ca[]
		char[] ca = s.toCharArray();
		//using bubble sort
		for(int i = 0; i < sb.length()-1; i++) {
			for(int j = 0; j < ca.length-1-i; j++) {
				if(ca[j] > ca[j+1]) {
					char temp = ca[j];
					ca[j] = ca[j+1];
					ca[j+1] = temp;
				}
				//System.out.println(Arrays.toString(ca));
			}
			//System.out.println();
		}
		return new String(ca);
	}
	
	
	//take a number as a string input, and return sum of the digits
	public static int sumOfDigits(String num) {
		int sum = 0;
		try {
		int x = Integer.parseInt(num);
		while(x != 0) {
			int rem = x % 10;
			sum = sum + rem;
			x = x / 10;
			}
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return sum;
	}
	
	//special character at the end
	public static String specialAtEnd(String str) {
		String temp1 = "";
		String temp2 = "";
		String temp3 = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90 || c >= 97 && c <= 122) {
				temp1 = temp1 + c;
			}
			else {
				if(c >= 48 && c <= 57) {
					temp2 = temp2 + c;
				}
				else if(c != 46){
					temp3 = temp3 + c;
				}
			}
		}
		return temp1.concat(temp3);
	}
	
	//return alphanumeric
	public static String returnAlphaNumeric(String str) {
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57 || c == 32) {
				temp = temp + c;
			}
		}
		return temp;
	}
	//insert the given word at specific index
	public static String insertWordAtIndex(String str, String word, int key) {
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == key) {
				temp = temp + " " + word + " ";
			}
			else {
				temp = temp + str.charAt(i);
			}
		}
		return temp;
	}
	
	//arrange words lexicographically
	public static String stringInLex(String str) {
		String[] sa = str.split(" ");
		Arrays.sort(sa);
		StringBuilder sb = new StringBuilder();
		for(String s : sa) {
			sb.append(s+" ");
		}
		return sb.toString();
	}
	
	//print only lowercase
	public static String printLower(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 97 && c <= 122) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	//lowercase to uppercase
	public static String lowerToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//sb.append(c);
			if(Character.isUpperCase(c)) {
				sb.append(c);
			}
			else if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args)throws IOException {
		
		System.out.println( lowerToUpper());
		
		
		//System.out.println(printLower("abCcDsAsEr"));
		//System.out.println(stringInLex("i am a programmer"));
		//System.out.println(stringInLex("day now any"));
		//System.out.println(stringInLex("one step at a time"));
		
		//System.out.println(insertWordAtIndex("how you?", "are", 3));
		//System.out.println(insertWordAtIndex("any now!", "day", 3));
		//System.out.println(insertWordAtIndex("i am a programmer?", "Java", 6));
		//System.out.println(returnAlphaNumeric("sudi@123_gmail.com"));
		//System.out.println(returnAlphaNumeric("any123@alpha@numeric.string"));
		//System.out.println(specialAtEnd("allan@gmail.com"));
		//System.out.println(specialAtEnd("any#rand@strinng%with!@special"));
		//System.out.println(sumOfDigits("4281"));
		//System.out.println(sortStringNoLib("had found a yellow metal, and because steamship and transportation"));
		//System.out.println(sortStringUsingLib("eadcb"));
		//System.out.println(addDigits());
		
	}
}
