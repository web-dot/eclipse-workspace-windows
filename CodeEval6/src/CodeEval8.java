import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class CodeEval8 {
	
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
	  return false;
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
	
	
	/*
	public static String zipZap2(String str) {
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if() {
				str = str.replace(str.charAt(c+2), ' ');
			}
		}
		return str;
	}*/
	
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
	
	//Q.126-The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
	
	public static int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for(int i = 0; i <= key.length-1; i++){
			if(answers[i].equals(key[i])){
				score = score + 4;
			}
			if(answers[i].equals("?")){
				score = score + 0;
			}
			if(!answers[i].equals(key[i]) ^ answers[i].equals("?")){
				score = score - 1;
				System.out.println("score = " + score);
			}
		}
		return score;
	}
	
	//Q.127-Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a
	public static int[] biggerTwo(int[] a, int[] b) {
		int sumA = 0;
		int sumB = 0;
		for(int i = 0; i < a.length; i++){
			sumA = sumA + a[i];
			sumB = sumB + b[i];
			System.out.println(sumA);
			System.out.println(sumB);
		}
		if(sumA > sumB){
			return a;
		}
		if(sumA == sumB){
			return a;
		}
		return b;
	}
	
	//Q.128- Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
	public static boolean mixStart(String str) {
		if(str.substring(1,2).equals("i") && str.substring(2,3).equals("x")){
			return true;
		}
		return false;
	}
	//Q.129-Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".Otherwise return the original string.
	public static String startOz(String str) {
		String s1 = str.substring(0,1);
		String s2 = str.substring(1,2);
		if((s1.equals("o") && s2.equals("z"))||(s1.equals("z")) && s2.equals("o")){
			str = s1 + s2;
		}
		else if(s1.equals("o")){
			str = "o";
		}
		else if(s2.equals("z")){
			str = "z";
		}
		return str;
	}
	
	
	
	//UIT Q.Return the string with max char sum
	public static String returnHighestSumString(String[] str){
		int[] arr = new int[26];
		int count = 0;
		int maxCount = 0;
		String maxWord = "";
		for(String word : str ){
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			arr[c-'a']++;
		}
		System.out.println(Arrays.toString(arr));
		for(int j = 0; j < arr.length; j++){
			if(arr[j] > 0){
				count = count + arr[j];
				}
			}
			if(count > maxCount){
			maxCount = count;
			maxWord = word;
			}
			for(int i : arr){
				arr[i] = 0;
			}
			count = 0;

		}
		return maxWord;
	}
	
	//Q.130-n: Pass an array of strings as parameter. Remove duplicates from it and return an array containing only unique strings.
	//my approach
	public static String[] removeDuplicates(String [] str){
		List<String> li = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();
		for(String word : str){
			if(!li.contains(word.toLowerCase())){
				String word2 = word.toLowerCase();
				li.add(word2);
				if(li.contains(word2)){
					li2.add(word);
				}
			}
		}
		return li2.toArray(new String[li2.size()]);
	}
	//refactor as per hint
	public static String[] removeDuplicates2(String[] str){
		ArrayList<String> al = new ArrayList<String>(); 
		ArrayList<String> buf = new ArrayList<String>();
		for(String s : str){
			if(!buf.contains(s.toLowerCase())){
				buf.add(s.toLowerCase());
				al.add(s);
			}
		}
		return al
		
		.toArray(new String[al.size()]);
	}
	
	//Q.131-A list of strings is given as input. Rearrange them in such a way that all character based strings come first and then all strings that have digits.

	//Q.132-A list of strings is given as input. Rearrange the strings in such a way that the last letter of the first word is the start letter of the second word and second words last letter should be the first letter of the third word and so on (anthakshari of words!). The first word is fixed.
	//NOT WORKING			//"Java","excel","android","logo", "dbase"
	
	public static ArrayList<String> AnthaksharyOfWords(ArrayList<String> words){
		ArrayList<String> ar = new ArrayList<String>(); 
		String temp = words.get(0);
		ar.add(temp);
		for(int i = 1; i < words.size(); i++){
			for(int j = 0; j < words.size(); j++){ 				
				if(temp.charAt(temp.length()-1) == words.get(j).charAt(0)){
					ar.add(words.get(j));
					temp = words.get(j);
					break;
				}
			}
		}
		return ar;
	}
	
	
	
	//Q.133-A list of strings is given as input. Take n(String length) as int input. Remove all strings having (length > = n )from the list and return it.
	public static ArrayList<String> removeStringFromList(ArrayList<String> arr,int n){
		ArrayList<String> sa = new ArrayList<String>();
		for(String s : arr){
			if(s.length() < n){
				sa.add(s);
			}
		}
		return sa;
	}
	
	
	//Q.134-Sort the list of strings based on string length and return it.
	public static ArrayList<String> sortListAccordingToStringLength(ArrayList<String> arr){
		String temp = null;
		for(int i = 0; i < arr.size(); i++){
			for(int j = i + 1; j < arr.size(); j++){
				if(arr.get(i).length() > arr.get(j).length()){
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
					}
				}
			}
			return arr;
	}
	
	//Q.135- Remove all recurring(repeating) Strings from a given List
	public static ArrayList<String> removeRecurringStrings(ArrayList<String> al){
		ArrayList<String> list = new ArrayList<String>();
		for(String s : al){
			if(!list.contains(s)){
				list.add(s);
			}
		}
		return list;
	}
	
	//Q.136-A list of strings is given as input. Rearrange them in 
	//such a way that all character based strings come first and 
	//then all strings that have digits.
	public static ArrayList<String> reArrangeWords(ArrayList<String> words){
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println(words);
		for(int i = 0; i < words.size(); i++){
			int flag = 0;
			for(int j = 0; j < words.get(i).length(); j++){
				if(Character.isDigit(words.get(i).charAt(j))) {
					flag = 1;
						}
					}
				if(flag == 0) {
					arr.add(words.get(i));
				}
		}
			for(int k = 0; k < words.size(); k++) {
				if(!arr.contains(words.get(k))) {
					arr.add(words.get(k));
				}
			}
			return arr;
			}
	
	//Q.137-Sort the list containing Strings in ascending order(natural ordering)
	//Note:Spaces sort before digits and characters,and that digits sort before 
	//characters and upper case characters sort before lowercase characters.

	
	//Q.138-Given a string, return a version where all the "x" have been removed. 
	//Except an "x" at the very start or end should not be removed.
	public static String stringX(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.substring(0,1).equals("x")) {
			sb.append(str.substring(0,1));
		}
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != 'x') {
				sb.append(c);
			}
		}
		if(str.substring(str.length()-1,str.length()).equals("x")) {
			sb.append(str.substring(str.length()-1,str.length()));
		}
		  return sb.toString();
	}
	
	//Q.139- Given 2 strings, a and b, return 
	//a string of the form short+long+short, with the 
	//shorter string on the outside and the longer 
	//string on the inside. The strings will not be 
	//the same length, and >=1
	public static String comboString(String a, String b) {
		String str = "";
		if(a.length() < b.length()) {
			str = a+b+a;
		}
		else {
			str = b+a+b;
		}
			
		  return str;	
	}
	//Q.140-We'll say that a number is "teen" if it is 
	//in the range 13..19 inclusive. Given 2 int 
	//values, return true if one or the other is teen, 
	//but not both.
	public static boolean loneTeen(int a, int b) {
		  return (13 <= a && a <= 19) ^ (13 <= b && b <= 19); 
	}
	//Q.141-Given a string, return a new string 
	//where "not " has been added to the front. 
	//However, if the string already begins with 
	//"not", return the string unchanged. Note: 
	//use .equals() to compare 2 strings. 
	//notString("candy")-->"not candy" , 
	//notString("x")-->"not x" , 
	//notString("not bad")-->"not bad"
	public static String notString(String str) {
		  if(str.contains("not")) {
			  return str;
		  }
		  return "not " + str;
	}
	//Q.141-A list of strings is given as input. 
	//Remove words that do not have vowels from 
	//it and return the list.
	public static ArrayList<String> removeWordsHavingNoVowels(ArrayList<String> al){
		//String[] sa = new String[] {"a", "e", "i", "o", "u"};
		ArrayList<String> arr = new ArrayList<String>();
		int flag = 0;
		for(int i = 0; i < al.size(); i++) {
			for(int j = 0; j < al.get(i).length(); j++) {
				String word = al.get(i);
				if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
					flag = 1;
				}
			}
			if(flag == 1) {
				arr.add(al.get(i));
			}
			flag = 0;
		}
		return arr;
	}
	//Q.142-Given 2 strings, a and b, return the number of the positions
	//where they contain the same length 2 substring. So "xxcaazz" and 
	//"xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear
	//in the same place in both strings.
	public static int stringMatch(String a, String b) 
	{
		int count = 0;
		if(a.length() < b.length() || a.length() == b.length()) {
		for(int i = 0; i < a.length()-1; i++) {
			//System.out.println(a.substring(i,i+2));
			
		  if(a.substring(i,i+2).equals(b.subSequence(i, i+2))) {
			  count++;
		  		}
			}
		}
		if(b.length() < a.length()) {
			for(int i = 0; i < b.length()-1; i++) {
				//System.out.println(a.substring(i,i+2));
				
			  if(a.substring(i,i+2).equals(b.subSequence(i, i+2))) {
				  count++;
			  		}
				}
			}
		return count;
	}
	//Q.143-Find number of occurances of a given String in a List
	public static int numberOfOccurence(ArrayList<String> list,String word){
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(word)) {
				count++;
			}
		}
		return count;
	}
	//Q.142-Write method to find the HCF(Highest Common Factor ) of two numbers a and b
	public static int recursively_findHCF(int a, int b){
		int hcf = 0;
		if(a > b) {
			for(int i = 1; i <= b; i++) {
				if(b % i == 0 && a % i == 0) {
					hcf = i;
				}
			}
		}
		if(a < b) {
			for(int i = 1; i <= a; i++) {
				if(a % i == 0 && b % i == 0) {
					hcf = i;
				}
			}
		}
		return hcf;
	}
	//Q.143-Write recursive method to calculate the factorial of a number
	public static long recursive_fact(int n){
		long f = 1;
		for(int i = 0; i < n; i++) {
			f = f *(i+1);
		}
		return f;
	}
	//Q.144- Add two integers without using + operator.
	public static int add(int a,int b){
		while(b != 0) {
			int carry = a & b;
			System.out.println("carry = " + carry);
			a = a ^ b;
			System.out.println("a = " + a);
			b = carry << 1;
			System.out.println("b = " + b);
		}
		return a;
	}
	//Q.145- Multiply two integers using bitwise operators.
	public static int multiplyWithoutStarOperator(int x, int y){
		int result = 0; 
		while(y != 0) {
			if((y & 1) != 0) {
				result = result + x;
				System.out.println("result = " + result);
			}
			x <<= 1;
			y >>= 1;
			System.out.println(x);
			System.out.println(y);
		}
		return result;
	}
	//Q.146- Divide two positive integers without using / or % operator.
	public static int divide(int x, int y){
		int result = 0;
		while((x-y)>= 0) {
			result++;
			x = x-y;
		}
		return result;
	}
	//Q.147-We want make a package of goal kilos of chocolate. 
	//We have small bars (1 kilo each) and big bars (5 kilos each). 
	//Return the number of small bars to use, assuming we always 
	//use big bars before small bars. Return -1 if it can't be done.
	public static int makeChocolate(int small, int big, int goal) 
	{
		int b = goal - (big * 5);
		System.out.println("b = " + b);
		int a = b % (small * 1);
		System.out.println("a = " + a);
		if(a == 0) {
			return b;
		}
		if(a == 1) {
			return -1;
		}
		return a;
	}
	//Q.148-Look for patterns like "zip" and "zap" in the string -- 
		//length-3, starting with 'z' and ending with 'p'. Return a 
		//string where for all such words, the middle letter is gone, 
		//so "zipXzap" yields "zpXzp".
		public static String zipZap(String str) {
			String str2 = "";
				for(int i = 0; i < str.length(); i++) {
					str2 = str2 + str.charAt(i);
					if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
						i++;
					}
				}
			 return str;
		}
	
		
	//MATRICES
		
	//Q.149-Check the given matrix is a Square Matrix. Explanation: A square matrix is an (n x n) 
	//matrix, that is, a matrix with the same number of rows as columns
	public static boolean findSquareMatrixOrNot(int[][] a){
		int rowA = a.length;
		int columnA = a[0].length;
		if(rowA == columnA) {
			return true;
		}
		return false;
	}
	//Q.150- Pass a Matrix as parameter and check whether the matrix is a UnitMatrix. 
	//Exp:A matrix in which all the elements are '1's called a Unit Matrix.
	public static boolean isUnitmatrix(int[][] a){
		boolean result = true;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] != 1) {
					result = false;
				}
			}
		}
		return result;
	}
	//Q.151-Pass a Matrix as parameter and check whether the matrix is an IdentityMatrix. 
	//Exp:A square matrix in which all the main diagonal elements are '1's and all the 
	//remaining elements are '0's is called an Identity Matrix.
	public static boolean isIdentityMatrix(int[][] a){
		for(int i = 0; i < a[1].length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(i == j && a[i][j] != 1) {
					return false;
				}
				if(i != j && a[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Q.152-Pass two matrices as parameter.Finf the sum of the matrices. 
	//Criteria: Number of rows and columns of two matrices should be Equal.
	public static int[][] addMatrices(int[][] a,int[][] b){
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[1].length; j++) {
				a[i][j] = a[i][j] + b[i][j];			}
		}
		return a;
	}
	
	//Q.151- Find Transpose of a Matrix. Def: The transpose of one
	//matrix is obtained by using rows from the first matrix as columns 
	//in the second matrix.
	public static int[][] transposeMatrix(int[][] matrix) {
		int[][] a = new int[matrix[0].length][matrix.length];
		System.out.println(matrix.length);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				a[j][i] = matrix[i][j];
			}
		}
		return a;
	}
	//Q.152-Find whether the given matrix is Symmetric 
	//matrix. Explanation:If the transpose of a matrix 
	//is equal to itself, that matrix is said to be 
	//Symmetric 
	
	//REFACTOR
	public static boolean findSymmetry(int[][] arr){
		int [][] matrix = new int [arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	/*
	public static boolean findSymmetry(int[][] arr){
		int [][] matrix = new int [arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				matrix[j][i] = arr[i][j];
				}
			}
		if(matrix == arr) {
			return true;
			}
		else
			return false;
		}*/
	//Q.153- Pass two matrices as parameter.Find the product(multiply) of two matrices 
	//and return it: Criteria:Number of columns of the first matrix should be equal to 
	//the number of rows of the second matrix.
	
	//refactor
	public static int[][] multiply(int [][] a,int [][] b){
		int sum = 0;
		int[][] multiply = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				for(int k = 0; k < b.length; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				multiply[i][j] = sum;
				sum = 0;
			}
		}
		return multiply;
	}
	//Q.154-Pass two matrices as parameter.Find the difference of the matrices. 
	//Criteria: Number of rows and columns of two matrices should be Equal.
	public static int[][] subtractMatrices(int[][] a,int[][] b){
		int difference = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = a[i][j] - b[i][j];
				}
		}
		return a;
	}
	
	//Q.155- Write recursive method to return the sum of the first n numbers
	public static long recursive_Sum(int value)
	{
		if(value > 0) {
		return value + recursive_Sum(value-1);
		}
		else
			return 0;
	}
	//Q.156-Write method to reverse a string using recursion
	public static  String recursive_reverse(String str)
	{
		if(str == null || str.length() <= 1) {
			return str;
		}
		else
			return recursive_reverse(str.substring(1)) + str.charAt(0);
	}
	
	//Q.156-Write recursive method to find the square of a number n.
	public static long recursive_squareOf(int n){
		if(n == 0) {
			return 0;
		}
		else {
			return recursive_squareOf(n-1) + (2 * n) - 1;
		}
	}
	
	//Q.157-Write recursive method to find the sum of digits of number
	public static int recursive_sumOfDigits(int number){
		if(number == 0) {
			return 0;
		}
		System.out.println(number%10 + number / 10);
		return (number % 10 + recursive_sumOfDigits(number / 10));
	}
	
	 //Q.158-Write method to print the series from a given begin 
	//value and ends with 15(ascending order)
	public static String recurseUp(int begin_value) {
		String s = "";
		for(int i = begin_value; i <= 15; i++) {
			s =  i + " ";
			System.out.println(s);
		}
		return "";
	}
	
	public static void print(int n) {
		int a = 0;
		if(a <= n) {
		System.out.println(a);
		}
		print(a+1);
	}
	
	
	
	public static void main(String[] args) {							
		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Book","Pencil","Computer","Sharpner","Eraser", "Computer"));
		int[][] a =  {{3,6},{5,8},{-2,9}};
		int[][] b = {{-6,1},{0,9},{8,3}};
		//print(12);
		//System.out.println(r);
		
		
		String r = recurseUp(3);
		System.out.println(r);
		
		
		/*
		 * integer size ==  4 bytes(4*8 = 32 bits)
		 * elements in array == 5
		 * size of array = 4 * 5 = 20 bytes
		 */
	

	}

}









