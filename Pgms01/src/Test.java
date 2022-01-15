import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;


//1.Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School, 
//he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N 
//and an integer K , where she needs to rotate the array in the right direction by K steps and then print 
//the resultant array. As she is new to the school, please help her to complete the task.

//2.Chef went to a shop and buys a pens and b pencils. Each pen costs x units and each pencil costs y units. 
//Now find what is the total amount Chef will spend to buy a pens and b

//3.You're given a number N. If N is divisible by 5 or 11 but not both then print "ONE"(without quotes).
//If N is divisible by both 5 and 11 then print "BOTH"(without quotes). If N is not divisible by 5 or 11 then print "NONE"(without quotes

//4.You are given a number N and find all the distinct factors of N.

//5.Given three distinct integers A, B and C, print the second largest number among them

//6.You're given two numbers L and R. Print all odd numbers between L and R (both inclusive) in a single line separated by space, in ascending (increasing) order

//7.Raju is planning to visit his favourite restaurant. He shall travel to it by bus. Only the buses whose numbers are divisible by 5 or by 6 
//shall take him to his destination. You are given a bus number N. Find if Raju can take the bus or not. Print YES if he can take the bus, otherwise print NO

//8.You are given a list of N integers and you need to reverse it and print the reversed list in a new line.

//9.You are given a list of N integers and a value K. Print 1 if K exists in the given list of N integers, otherwise print −1.

public class Test{
	public static void main(String[] args) throws IOException {
		//1
		/*
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> list1 = new ArrayList<Integer>();
		int temp = 0;
		for(int i = K+1; i < arr.length; i++) {
			temp = arr[i];
			list1.add(temp);
		}
		for(int i = 0; i <= K; i++) {
			list1.add(arr[i]);
		}
		//System.out.println(list1);
		
		int[] narr = new int[list1.size()];
		for(int i = 0; i < narr.length; i++) {
			narr[i] = list1.get(i);
		}
		
		for(int i = 0; i < narr.length; i++) {
			System.out.print(narr[i] + "");
		}
		*/
		//2
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String infoStr = br.readLine();
		String[] sa = infoStr.split(" ");
		int[] arr = new int[sa.length];
		for(int i = 0; i < sa.length; i++) {
			arr[i] = Integer.parseInt(sa[i]);
		}
		int result = arr[0] * arr[2] + arr[1] + arr[3];
		System.out.println(result);
		*/
		
		//3
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		if((num % 5 == 0) ^ (num % 11 == 0)) {
			System.out.println("ONE");
		}
		else if((num % 5 == 0) && (num % 11 == 0)) {
			System.out.println("BOTH");
		}
		else {
			System.out.println("NONE");
		}
		*/
		
		//4
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
				list.add(i);
			}
		}
		System.out.println(count);
		for(int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		*/
		
		//5
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int[] arr2  =  new int[3];
		Iterator<Integer> iter = set.iterator();
		int k = 0;
		while(iter.hasNext()) {
			int n = iter.next();
			arr2[k] = n;
			k++;
			}
		System.out.println(arr2[1]);
		*/
		
		//6.
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String[] sa = in.split(" ");
		int start = 0;
		int end = 0;
		for(int i = 0; i < sa.length; i++) {
			start = Integer.parseInt(sa[0]);
			end = Integer.parseInt(sa[1]);
		}
		for(int i = start; i <= end; i++) {
			if(!(i % 2 == 0)) {
				System.out.print(i + " ");
			}
		}
		*/
		
		//7
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int num = Integer.parseInt(in);
		System.out.println(num);
		if(num % 5 == 0 || num % 6 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		*/
		
		//8
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String count = br.readLine();
		String[] sa = br.readLine().split(" ");
		System.out.println(count);
		System.out.println(Arrays.toString(sa));
		for(int i = sa.length-1; i >= 0; i--) {
			System.out.print(sa[i] + " ");
		}
		*/
		
		//9
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] na = br.readLine().split(" ");
		String[] arr = br.readLine().split(" ");
		int num = Integer.parseInt(na[1]);
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(Integer.parseInt(arr[i]) == num) {
				result = 1;
				break;
			}
			else{
				result = -1;
			}
		}
		System.out.println(result);
		*/
		
		//check if triangle
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int[] arr = new int[sa.length];
		for(int i = 0; i < sa.length; i++) {
			arr[i] = Integer.parseInt(sa[i]);
		}
		if((arr[0] + arr[1] > arr[2]) && (arr[1] + arr[2] > arr[0]) && (arr[2] + arr[0] > arr[1])) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		*/
		
		//reverse integer
		
		//lapindrome
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		String s1 = "";
		String s2 = "";
		Set<Character> set1 = new TreeSet<Character>();
		Set<Character> set2 = new TreeSet<Character>();
		for(String s : arr) {
			if(s.length() % 2 == 0) {
			String sub1 = s.substring(0, s.length()/2);
			System.out.println("sub1 = " + sub1);
			for(int i = 0; i < sub1.length(); i++) {
				char c = sub1.charAt(i);
				set1.add(c);
			}
			String sub2 = s.substring(s.length()/2, s.length());
			System.out.println("sub2 = " + sub2);
			for(int i = 0; i <= sub2.length()-1; i++) {
				char c = sub2.charAt(i);
				set2.add(c);
			}
			if(set1.equals(set2)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			}
			System.out.println(set1);
			System.out.println(set2);
			set1.clear();
			set2.clear();
			if(s.length() % 2 == 1) {
				String sub3 = s.substring(0, s.length()/2);
				for(int i = 0; i < sub3.length(); i++) {
					char c = sub3.charAt(i);
					set1.add(c);
				}
				String sub4 = s.substring(s.length()/2 + 1, s.length());
				for(int i = 0; i < sub4.length(); i++) {
					char c = sub4.charAt(i);
					set2.add(c);
				}
				if(set1.equals(set2)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			System.out.println("abc".equals("cab"));
		}
		*/
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		int n = br.read();
		Set<Character> set1 = new TreeSet<Character>();
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			list.add(s);
		}
		int count = 0;
		String sub1 = "";
		String sub2 = "";
		String sub3 = "";
		String sub4 = "";
		for(String s : list) {
			if(s.length() % 2 == 0) {
			sub1 = s.substring(0, s.length()/2);
			sub2 = s.substring(s.length()/2, s.length());
			for(int i = 0; i <= sub2.length()-1; i++) {
				char c1 = sub1.charAt(i);
				char c2 = sub1.charAt(i);
				if(c1 == c2) {
					set1.add(c1);
					count++;
					}
				}
			if(set1.size() == count) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			}
			set1.clear();
			if(s.length() % 2 == 1) {
				sub3 = s.substring(0, s.length()/2);
				sub4 = s.substring(s.length()/2 + 1, s.length());
				for(int i = 0; i <= sub2.length()-1; i++) {
					char c1 = sub3.charAt(i);
					char c2 = sub4.charAt(i);
					if(c1 == c2) {
						set1.add(c1);
						count++;
						}
					}
				if(set1.size() == count) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
		*/
		
	
		
		
		
		
		
		
	}
}



