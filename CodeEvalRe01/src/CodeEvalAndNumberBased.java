import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CodeEvalAndNumberBased {
	
	//CODE EVAL PAGE 01
	
	//array
	//Q.1-Given an array of 'N' elements .Return the sum of all array elements recursively
	/*
	 * REFACTOR
	public static int arraySum(int[] arr) {
		int len = arr.length;
		if(len == 1) { //base case
			return arr[len - 1];
		}
		
		int result = arr[0] + arraySum(Arrays.copyOf(arr, len - 1)); 
		
		return result;
	}*/
	//without recursion
	public static int arraySum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	//Pass an int array and an int and do a search of the second parameter in the first, and return true/false.
	public static boolean searchElement(int[] a, int numberToSearch) {
		for(int i = 0 ; i < a.length; i++) {
			if(a[i] == numberToSearch) {
				return true;
			}
		}
		return false;
	}
	
	//Write a program to generate Fibonacci series of limit number of elements.
	
	//REFACTOR
	/*
	public static int[] generateFibSeries(int limit) {
		int a = 0;
		int b = 1;
		int c = 0;
		String result = "";
		result = result + a + " " + b + " ";
		while(c < limit) {
			c = a + b;
			if(c < limit) {
			result = result + c + " ";
			a = b;
			b = c;
			}
		}
		return result;
	}*/
	
	//Given an array of ints, return true if one of the first 4 
	//elements in the array is a 9. The array length will be 
	//greater than 4. arrayFront9({1, 2, 9, 3, 4})-->true , 
	//arrayFront9({1, 2, 3, 4, 9})-->false , 
	//arrayFront9({1, 2, 3, 4, 5})-->fals
	public static boolean arrayFront(int[] nums) {
		for(int i = 0; i < 4; i++) {
			if(nums[i] == 9) {
				return true;
			}
		}
		return false;
	}
	
	//Pass an int as parameter. Find the sum of the digits in the number and return it.
	public static int sumOfDigits(int num) {
		int sum = 0;
		int count = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			count++;
		}
		return sum;
	}
	
	//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8
	public static boolean sum28(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				sum = sum + arr[i];
			}
		}
		if(sum == 8) {
			return true;
		}
		return false;
	}
	//Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
	public static boolean haveThree(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] == 3 && nums[i+2] == 3) {
				//System.out.println(nums[i+2]);
					count++;
			}
			if(nums[i] == 3 && nums[i+1] == 3) {
				return false;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
	

	//Q.4-Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
	public static boolean or35(int n) {
		if(n % 5 == 0 || n % 3 ==0) {
			return true;
		}
		return false;
	}
	
	//Q.8-Given an array of 'N' elements .Return the sum of all array elements
	public static long arraySum2(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	//Q.9- Pass an int array and an int and do a search of the second parameter in the first, and return true/false.
	public static boolean searchElement2(int[] a, int n) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	//Q.10-Pass an int as parameter. Find the sum of the digits in the number and return it.
	public static int returnSum(int num) {
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
	//Q.19-Given an array of ints, return true if the sum of all the 2's in the array is exactly 8
	public static boolean checkSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			if(i == 2) {
				sum = sum + i;
			}
		}
		if(sum == 8) {
			return true;
		}
		return false;
	}
	//Q.12-Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
	//The array length will be greater than 4. arrayFront9({1, 2, 9, 3, 4})-->true , 
	//arrayFront9({1, 2, 3, 4, 9})-->false , arrayFront9({1, 2, 3, 4, 5})-->false
	public static boolean ifPresent(int[] arr) {
		for(int i = 0; i <= 3; i++) {
			if(arr[i] == 9) {
				return true;
			}
		}
		return false;
	} 
	//Q.20- Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
	//and no 3's are next to each other.
	public static boolean checkCount(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 3) {
				//System.out.println(arr[i]);
				count = count + 1;
			}
		}
		System.out.println(count);
		if(count == 3) {
			return true;
		}
		return false;
	}
	
	//return true if array contains three increasing adjacent numbers
	public static boolean tripleUp(int[] nums) {
		for(int i = 0; i < nums.length-2; i++) {
			if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2]) {
				if((nums[i]*3+3) == (nums[i] + nums[i+1] + nums[i+2])) {
					return true;
					}
				}
			}
		return false;
		}
	
	//return true if array contain 3 even or 3 odd values
	public static boolean modThree(int[] nums) {
		for(int i = 0; i < nums.length-2; i++) {
				if(((nums[i]&1)==0 && (nums[i+1]&1)==0 && (nums[i+2]&1)==0) || ((nums[i]&1)==1 && (nums[i+1]&1)==1 && (nums[i+2]&1)==1)) {
					return true;
				}
		}
		return false;
	}
	
	//return true if every element is either 1 or 4
	public static boolean only14(int[] nums) {
		boolean ret = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 4) {
				ret = true;
			}
			else {
				ret = false;
				break;
			}
		}
		return ret;
	}
	
	//return true if number of 1 is greater than number of 4
	public static boolean stringBits(int[] nums) {
		int c1 = 0;
		int c4 = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				c1 = c1 + 1;
			}
			if(nums[i] == 4) {
				c4 = c4 + 1;
			}
		}
		if(c1 > c4) {
			return true;
		}
		return false;
	}
	
	//swap the first and last elements in array
	public static int[] swapEnds(int[] nums) {
		int l = nums.length-1;
		nums[0] = nums[0] ^ nums[l];
		nums[l] = nums[0] ^ nums[l];
		nums[0] = nums[0] ^ nums[l];
				return nums;
	}
	
	//no of times two six are next to each other, also 7 is next to 6
	public static int array667(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7) {
				count = count + 1;
			}
		}
		return count;
	}
	
	//given 3 ints return true if its possible to to add two of the ints to get the third
	public static boolean twoAsOne(int a, int b, int c) {
		if(a + b == c || b+c == a || a+c == b) {
			return true;
		}
		return false;
	}
	
	//Count the number of "xx" in the given string. 
	//We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	public static int countXX(String str) {
		int count = 0;
		char[] ca = str.toCharArray();
		for(int i = 0; i < ca.length-1; i++) {
			if(ca[i] == 'x' && ca[i+1] == 'x') {
				count++;
			}
		}
		return count;
	}
	
	
	//given a non-negative number n where (n>0), create and return a new string array of length
	//n, containing the strings "0", "1", "2" through n-1
	public static String[] fizzArray(int n) {
		String[] strArr = new String[n];
		for(int i = 0; i < n; i++) {
			strArr[i] = Integer.toString(i);
		}
		return strArr;
	}
	
	//Given an array of ints, return true if the array contains a 
	//2 next to a 2 or a 4 next to a 4, but not both.
	
	public static boolean either24(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == 2 && nums[i+1] == 2) {
				count++;
			}
		}
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == 4 && nums[i+1] == 4) {
				count++;
			}
		}
		if(count == 2 || count == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//Return the sum of the numbers in the array, 
	//except ignore sections of numbers starting with a 
	//6 and extending to the next 7 (every 6 will be followed by at least one 7). 
	//Return 0 for no numbers.
	public static int sum67(int[] nums)
	{
	  boolean flag = true;
	  int sum = 0;
	  for(int i = 0; i < nums.length; i++) {
		  if(flag) {
			  sum = sum + nums[i];  
		  }
		 if(nums[i] == 6) {
			 flag = false;
		 }
		 if(nums[i] == 7) {
			 flag = true;
		 }
	  }
	  return sum;
	}

	
	
	public static void main(String[] args) {
		
		//System.out.println(either24(new int[] {2, 2, 1, 1, 4}));
		
		int[] a1 = new int[] {1,2,2,6,99,99,7};
		System.out.println(sum67(a1));
	}
}













