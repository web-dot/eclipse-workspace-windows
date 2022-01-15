import java.util.Scanner;

import sun.jvm.hotspot.debugger.MachineDescriptionIntelX86;

import java.util.Arrays;
import java.util.ArrayList;

public class DrivePgms02 {
	
	//[19]find the frequency of a digit in a number
	public static int findFrequency(int num, int digit) {
		//System.out.println(num % 10);
		//System.out.println(num / 10);
		int count = 0;
		
		while(num > 0) {
			int rem = num % 10;
			//num = num / 10;
			if(rem == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}
	
	//[20]print Yes if the number is perfect number else print No.
	public static String checkPerfect(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		if(sum == num) {
			return "Yes";
		}
		return "No";
	}
	
	//FIND FACTORS
	public static ArrayList<Integer> findFactor(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				arr.add(i);
			}
		}
		System.out.println(arr);
		return arr;
	}
	
	
	//CHECK PRIME NUMBER
	public static boolean CheckPrime(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
				if((num % i) == 0) {
					count++;
					System.out.println(count);
			}
		}
		if(count == 2) {
			return true;
		}
		else
		 return false;
	}
	//FACTORIAL OF A NUMBER
	public static int findFactorial(int num) {
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	//check whether strong number
	public static boolean checkStrong(int num) {
		int val = num;
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			int factorial = 1;
			for(int i = 1; i <= rem; i++) {
				factorial = factorial * i;
			}
			sum = sum + factorial;
			num = num / 10;
		}
		if(val == sum) {
			return true;
		}
		return false;
	}
	//check if harshad number
	public static boolean checkHarshad(int num) {
		int sum = 0;
		int val = num;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			//System.out.println(sum);
		}
		if(val % sum == 0) {
			return true;
		}
		return false;
	}
	
	//check if armstrong number
	public static boolean checkArmstrongNumber(int num) {
		int val = num;
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + (rem*rem*rem);
			num = num /10;
		}
		if(val == sum) {
			return true;
		}
		return false;
	}
	//sum of series of number
	public static int findSeries(int num) {
		int sum = 0;
		for(int i = 0; i <= num; i++) {
		sum = sum +i;	
		}
		return sum;
	}
	//find LCM
	public static int findLCM(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;		System.out.println(max);
		System.out.println();
		while(true) {
			if((max % num1 == 0) && (max % num2 == 0)) {
				break;
			}
			max++;
			//System.out.println(max);
		}
		return max;
	}
	
	//find HCF
	public static int findHCF(int num1, int num2) {
		int min = (num1 < num2) ? num1 : num2;
		System.out.println(min);
		System.out.println();
		while(true) {
			if((num1 % min == 0) && (num2 % min == 0)) {
				break;
			}
			--min;
			System.out.println(min);
		}
		return min;
	}
	
	public static void findLcmAndHcf(int num1 , int num2) {
		int lcm = 0;
		int hcf = 0;
		int max = (num1 > num2) ? num1 : num2;
		while(true) {
			if((max % num1 == 0) && (max % num2 == 0)) {
				break;
			}
			max++;
		}
		
		lcm = max;
		hcf = (num1 * num2) / lcm;
		System.out.println("LCM is = " + lcm);
		System.out.println("HCF is = " + hcf);
	}
	
	//Arrays
	
	//fill array with same number
	public static void fillArrayWithCons() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int n  = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value to fill");
		int m = scan.nextInt();
		Arrays.fill(arr, m);
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	
	//fill array at given index
	public static void fillArrayAtPos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//input value
		System.out.println("Enter value to fill");
		int v = sc.nextInt();
		//input index
		System.out.println("Enter from index");
		int inFrm = sc.nextInt();
		System.out.println("Enter to index");
		int inTo = sc.nextInt();
		Arrays.fill(arr, inFrm, inTo, v);
		System.out.println(Arrays.toString(arr));
	}
	
	//find common elements in two arrays
	public static void findCommon(int[] a, int [] b) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
			if(a[i] == b[j]) {
				arr.add(a[i]);
				//System.out.println(a[i]);
					}
				}
			}
		System.out.println(arr);
	}
	//to check if the given number is palindrome
	public static boolean checkPalindrome(int num) {
		int rem = 0;
		int sum = 0;
		int temp = num;
		while(num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		boolean r = checkPalindrome(313);
		System.out.println(r);
	}

}
