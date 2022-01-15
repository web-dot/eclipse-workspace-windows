import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



class compareStrings implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}


public class StringPgmsUsingIO {
	
	//Q.1-WAM to accept a string and return a boolean to indicate 
	//whether the string passed is a boolean or not.
	public static boolean checkStringForBoo(String str) {
		boolean isBool = false;
			if(str == "true" || str == "false") {
				isBool = true;
			}
			else 
				isBool = false;
		return isBool;
	}
	
	//Q.2-//Q.2-WAM to accept a string. Identify how many times
	//each character is repeating in it.
	//CLA
	public static void charCount(String str) {
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			//System.out.println((int)c - 'a');
			arr[(int)c - 'a']++;
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.println("count 0f " + (char)(j + 'a') + " = " + arr[j]);
		}
		//System.out.println(Arrays.toString(arr));
	}
	
	////Q.3-WAM to accept a string as parameter. Convert the string 
	//characters to lowercase if its uppercase and to uppercase
	//if its lowercase. If there are digits or special chars in 
	//the string, they should be omitted.
	
	public static String invertString(String str) {
		StringBuilder sb = new StringBuilder();
		 for(int j = 0; j < str.length(); j++) {
			 char c = str.charAt(j);
			 if(Character.isLowerCase(c)) {
				 c = Character.toUpperCase(c);
				 sb.append(c);			 
				 }
			 else if(Character.isUpperCase(c)) {
				 c = Character.toLowerCase(c);
				 sb.append(c);
			 }
		 }
		 return sb.toString();
	}
	//Q.4-WAM to accept a string as parameter. Find out how 
	//many digits, consonants, vowels are there in it and print 
	//it out.
	public static void countStringProfile() {
		
	}
	
	//Q.5-WAM to accept a string as input. The method should 
	//return a string which does not contain any repeating characters.
	public static String noRepeat(String str) {
		String str2 = "";
		for(int i = 0; i < str.length(); i++) {
			String sub = str.substring(i, i+1);
			if(!str2.contains(sub)) {
				//System.out.println(sub);
				str2 = str2 + sub;
			}
		}
		
		return str2;
	}
	
	//Q.6-WAM to accept 2 strings as input. Find out how many times does the second 
	//param occur in the first one (number of occurances) and return the count.
	public static int countSubstring(String mainStr, String subStr) {
		
		int count = 0;
		int pos = 0;
			while((pos = mainStr.indexOf(subStr, pos)) != -1) {
				pos++;
				count++;
			
		}
		return count;
	}
	
	//Q.7-WAM to accept an array of strings as parameter. 
	//Remove duplicates from it and return an array containing only
	//unique strings.
	//STRING ARRAY OF WORDS//ORDER NOT CONSERVED
	public static String[] uniqueStrArr(String[] strArr) {
		Set<String> set = new TreeSet<String>();
		for (String word : strArr) {
			set.add(word);
		}
		
		//ADD ELEMENTS FROM TREESET TO STRINGARR
		int k = 0;
		Iterator<String> iter = set.iterator();
		String[] newArr = new String[set.size()];
		while(iter.hasNext()) {
			newArr[k] = iter.next();
			k++;
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	
	//READ A FILE//REMOVE DUPLICATES//CONSERVE ORDER//WRITE
	public static void writeUnique(String path) {
		if(path == null) {
			throw new IllegalArgumentException();
		}
		File f = new File(path);
		if(f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File file : fa) {
				if(file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
				BufferedReader br = null;
				BufferedWriter bw = null;
				try {
					br = new BufferedReader(new FileReader(file));
					List<String> content = new ArrayList<String>();
					String line;
					while((line = br.readLine()) != null) {
						String[] strArr = line.split(" ");
						for(String str : strArr) {
							str = str.toLowerCase();
							if(!content.contains(str)) {
								content.add(str);
							}
						}
					}
					br.close();
					br = null;
					bw = new BufferedWriter(new FileWriter(file));
					for(String str1 : content) {
						bw.write(str1 + " ");
					}
					System.out.println("File updated");
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					if(br != null) {
						try {br.close();}catch(IOException e) {e.printStackTrace();}
					}
					if(bw != null) {
						try {bw.close();}catch(IOException e) {e.printStackTrace();}
					}
				}
				}
			}
		}
	}
	//Q.8-WAM to accept an array of strings and an int as parameters. Remove all strings 
	//which has length equal to or greater than the int that is passed from the array and
	//return the array.
	public static String[] removeStringOfLength(String[] arr, int len) {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() < len) {
				list.add(arr[i]);
			}
		}
		String[] arrNew = new String[list.size()];
		Iterator<String> iter = list.iterator();
		int k = 0;
		while(iter.hasNext()) {
			arrNew[k] = iter.next();
			k++;
		}
		return arrNew;
	}
	
	//Q.9-WAM to accept a string as parameter. Reverse the string and 
	//return it. All the words in the strings should be individually reversed and then returned.
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse(); 
		return sb.toString();
	}
	
	//Q.10-WAM to accept a string as input. Return 
	//a new string which contains the passed strings 
	//words in a sorted manner.
	public static String sortString(String str) {
		List<String> content = new ArrayList<String>();
		String[] strArr = str.split(" ");
		for(String word : strArr) {
			content.add(word);	
			}
		Collections.sort(content);
		String newStr = "";
		for(String cword : content) {
			newStr = newStr + cword + " ";
		}
		return newStr;
	}
	
	//Q.11-Given a string reverse it and return
	public static void reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	//Q.11[a]-Given a string reverse without using built in methods
	public static void reverseStringWithoutBuiltIn(String str) {
		char[] ca = str.toCharArray();
		for(int i = 0; i < ca.length/2; i++) {
		ca[i] = (char)(ca[i] ^ (ca[ca.length-i-1]));
		ca[ca.length-i-1] = (char)(ca[i] ^ (ca[ca.length-i-1]));
		ca[i] = (char)(ca[i] ^ (ca[ca.length-i-1]));
		}
		str = new String(ca);
		System.out.println(str);
	}
	
	//Q.12-Given a string find out if it is a 
	//plindrome.
	public static boolean checkPalin(String str) {
		int l = str.length()/2;
		String s1 = str.substring(0, l+1);
		String s2 = str.substring(l, str.length());
		StringBuilder sb = new StringBuilder(s2);
		String s3 = sb.reverse().toString();
		return s1.equals(s3);		
		}
	
	//Q.13-Given a string reverse all individual words of a 
	//sentence
	public  static void reverseWords(String str) {
		String[] strArr = str.split(" ");
		String newStr = "";
		for(String word: strArr) {
			StringBuilder sb = new StringBuilder(word);
			sb = sb.reverse();
			String s = sb.toString();
			newStr = newStr + s + " ";
		}
		//StringBuilder sb = new StringBuilder();
		System.out.println(newStr);
	}

	////Q.14-Given a string find out all the unique chars.
	public static char[] findUniqueChars(String str) {
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
			if(!list.contains(c)) {
				list.add(c);
			}
		}
		int k = 0;
		char[] c1 = new char[list.size()];
		for(int j = 0; j < c1.length; j++) {
			c1[k] = list.get(j);
			k++;
		}
		return c1;
	}
	
	//Q.15-Given a string find out how
	//many occurances of each element is there
	public static void charOcc(String str) {
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c-'a']++;
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println("occurance of: " + (char)(j+'a') + " is: " + arr[j]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		charCount("thequickbrownfoxjumpsoverthelazydog");
		//String r = invertString("SyStEmProCess411245_SuDip_ThREaD");
		//System.out.println(r);
		//String str = noRepeat("aabcdde");
		//System.out.println(str);
		
		//String s1 = "this is this that is this jist mist";
		//String s2 = "th";		
		//int i = countSubstring(s1, s2);
		//System.out.println(i);
		
		//String[] strArr = {"is there", "everything", "how", "we", "think there", "is", "as", "it", "is"};
		//String[] arr = uniqueStrArr(strArr);
		//System.out.println(arr);
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a path");
		//String path = sc.nextLine();
		//writeUnique(path);
		
		//String[] s1 = {"there", "everything", "how", "we", "there", "is", "as", "it", "is"};
		//int l = 4;
		//String[] s = removeStringOfLength(s1, l);
		//System.out.println(Arrays.toString(s));
		
		//String str = "sudipto chakraborty is a good programmer";
		//String r = reverseString(str);
		//System.out.println(r);
		
		//String str = "everyday we do things that we do everyday we do other things that other people do everyday as well";
		//String str2 = sortString(str);
		//System.out.println(str2);
		
		//reverse("hello");
		
		//boolean r = checkPalin("civic");
		//System.out.println(r);
		
		//String str = "a string reverse all individual words of a sentence";
		//reverseWords(str);
		
		//char[] c = findUniqueChars("aaaeedcnnnskkkzzxiirt");
		//System.out.println(c);
		
		//charOcc("temperatures");
		
		//String str = "any day now";
		//invertString(str);
		
		//reverseWords(str);
		
	}
}
	

