package com.recap.array;

import java.util.Arrays;

public class CBArray01 {
	
	//if 6 appears
	public static boolean firstLast6(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[0] == 6 || nums[nums.length-1] == 6) {
				return true;
			}
		}
		return false;
	}
	//if array length is 1 or more and first elem and last elem are equal
	public boolean sameFirstLast(int[] nums) {
		if(nums.length >= 1) {
			for(int i = 0; i < nums.length; i++) {
				if(nums[0] == nums[nums.length-1]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//return int array of length containing first 3 digits of pi
	public int[] makePi() {
		return new int[] {3, 1, 4};
	}

	//given two array return true if they have same first element or same last element
	public boolean commonEnd(int[] a, int[] b) {
		if(a.length == 1) {
			if(a[0] == b[0] || a[0] == b[b.length-1]) {
				return true;
			}			
		}
		else if(b.length == 1) {
			if(b[0] == a[0] || b[0] == a[b.length-1]) {
				return true;
			}			
		}
		else if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
		}
		return false;
	}
	
	//return sum of all elements, int arr of length 3
	public int sum3(int[] nums) {
		
		return nums[0] + nums[1] + nums[2];
	}
	
	//
	public int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}
	
	//return elements in reverse order
	public static int[] reverse3(int[] nums) {
		int[] arr = new int[3];
		int k = 0;
		for(int i = nums.length-1; i >= 0; i--) {
			arr[k] = nums[i];
			k++;
		}
		return arr;
	}
	
	//check if the first or last element is larger
	//set others same
	public static int[] maxEnd3(int[] nums) {
		if(nums[0] > nums[nums.length-1] || nums[0] == nums[nums.length-1]) {
			for(int i = 0; i < nums.length; i++) {
				nums[i] = nums[0];
			}
		}
		if(nums[nums.length-1] > nums[0]) {
			if(nums[nums.length-1] > nums[0]) {
				for(int i = 0; i < nums.length; i++) {
					nums[i] = nums[nums.length-1];
				}
			}
		}
		return nums;
	}
	
	//return sum of first two
	public static int sum2(int[] nums) {
		int sum = 0;
		if(nums.length == 1) {
			return nums[0];
		}
		if(nums.length > 1) {
			for(int i = 0; i < 2; i++) {
				sum = sum + nums[i];
			}
		}
		return sum;
	}	
	
	//given 2 arrays return array with middle elements
	public int[] middleWay(int[] a, int[] b) {
		int[] arr = new int[2];
		arr[0] = a[1];
		arr[1] = b[1];
		return arr;
	}
	//return first and last
	public int[] makeEnds(int[] nums) {
		int[] arr = new int[2];
		arr[0] = nums[0];
		arr[1] = nums[nums.length-1];
		return arr;
	}
	
	//return true if array contains 2 or 3
	public boolean has23(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 2 || nums[i] == 3) {
				return true;
			}
		}
		return false;
	}

	//return true if it does not contain 2 nad 3
	public boolean no23(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 2 || nums[i] == 3) {
				return false;
			}
		}
		return true;
	}

	//given a array return double length array where last
	//element is same as original array and other elements are 0
	public int[] makeLast(int[] nums) {
		int[] arr = new int[2*nums.length];
		arr[arr.length-1] = nums[nums.length-1];
		return arr;
	}

	//return true if array contains 2 twice and
	//3 twice
	public boolean double23(int[] nums) {
		if(nums.length == 0) {
			return false;
		}
		else if(nums.length == 1) {
			return false;
		}
		else {
		if((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
			return true;
			}
		}
		return false;
	}
	
	//if there is a 2 in array immediately followed by 3
	//set the 3 to 0
	public static int[] fix23(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 2 && nums[i+1] == 3) {
				nums[i+1] = 0;
			}
		}
		return nums;
	}
	//Start with 2 int arrays, a and b, of any length. 
	//Return how many of the arrays have 1 as their first element.
	
	/*
	 * {}, {}
	 * {1},{}
	 * {},{1}
	 * {1},{1}
	 * {2},{2}
	 * */
	public static int start1(int[] a, int[] b) {
		int count = 0;
		if(a.length == 0 && b.length == 0) {
			return 0;
		}
		else if(a.length >= 1 && b.length == 0) {
			if(a[0] == 1) {
				count++;
			}
		}
		else if(a.length == 0 && b.length >= 1) {
			if(b[0] == 1) {
				count++;
			}
		}
		else if(a.length >= 1 && b.length >= 1) {
			if(a[0] == 1) {
				count++;
			}
			if(b[0] == 1) {
				count++;
			}
		}
		return count;
	}

	//return array with largest sum
	public static int[] biggerTwo(int[] a, int[] b) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i : a) {
			sum1 = sum1 + i;
		}
		for(int i : b) {
			sum2 = sum2 + i;
		}
		if(sum1 > sum2) {
			return a;
		}
		else if(sum2 > sum1) {
			return b;
		}
		return a;
	}

	//even length array, return middle two
	public static int[] makeMiddle(int[] nums) {
		  int n = nums.length/2;
		  return new int[] {nums[n-1], nums[n]};
	}

	//given 2 array of length 2, return new array of length 4 with all the elements
	public int[] plusTwo(int[] a, int[] b) {
		int[] arr = new int[4];
		arr[0] = a[0];
		arr[1] = a[1];
		arr[2] = b[0];
		arr[3] = b[1];
		return arr;
	}
	
	//swap the first and last element in array
	public static int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length-1];
		nums[nums.length-1] = temp;
		return nums;
	}
	
	//given an array of odd length, return middle 3 elements
	public static int[] midThree(int[] nums) {
		int[] arr = new int[3];
		arr[0] = nums[nums.length/2 - 1];
		arr[1] = nums[nums.length/2];
		arr[2] = nums[nums.length/2 + 1];
		return arr;
	}
	
	//return largest of the first middle or the last element of odd array
	public static int maxTriple(int[] nums) {
		System.out.println(nums[nums.length/2]);
		if(nums[0] > nums[nums.length/2] && nums[0] > nums[nums.length-1]) {
			return nums[0];
		}
		else if(nums[nums.length/2] > nums[0] && nums[nums.length/2] > nums[nums.length-1]) {
			return nums[nums.length/2];
		}
		return nums[nums.length-1];
	}
	
	//return first 2 elements
	public int[] frontPiece(int[] nums) {
		if(nums.length >= 2) {
		int[] arr = new int[2];
		arr[0] = nums[0];
		arr[1] = nums[1];
		return arr;
		}
		return nums;
	}
	
	// 1 followed by 3 is unlucky in first 2 or last 2 elements
	public static boolean unlucky(int[] nums) {
		if(nums.length > 2) {
			if(nums[0] == 1 && nums[1] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
				return true;
			}
			else if(nums[1] == 1 && nums[2] == 3) {
				return true;
			}
		}
		else if(nums.length == 2){
			if(nums[0] == 1 && nums[1] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
				return true;
			}
		}
		return false;
	}
	
	//fit as much as from 2 arrays, there will be 2 or more elements available between 2 arrays
	//[>=2]
	//[1]       [1]
	//[0]		[>=2]
	public static int[] make2(int[] a, int[] b) {
		int[] arr = new int[2];
		if(a.length >= 2) {
			int k = 0;
			for(int i = 0; i < arr.length; i++) {
				arr[k] = a[i];
				k++;
			}
		}
		if(a.length < 2) {
			if(a.length == 1) {
				arr[0] = a[0];
				arr[1] = b[0];
			}
			else if(a.length == 0) {
				int k = 0;
				for(int i = 0; i < arr.length; i++) {
					arr[k] = b[i];
					k++;
				}
			}
		}
		return arr;
	}
	
	//return first element of each array
	//[]		[]
	
	public static int[] front11(int[] a, int[] b) {
		int[] arr = new int[2];
		if(a.length == 0 && b.length == 0) {
			int[] arr3 = new int[0];
			return arr3;
		}
		else if(a.length == 0) {
			int[] arr1 = new int[1];
			arr1[0] = b[0];
			return arr1;
		}
		else if(b.length == 0) {
			int[] arr2 = new int[1];
			arr2[0] = a[0];
			return arr2;
		}
		else if(a.length >= 1 && b.length >= 1) {
			arr[0] = a[0];
			arr[1] = b[0];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] a = {};
		int[] b = {};
		int[] r = front11(a, b);
		System.out.println(Arrays.toString(r));	
		
		
	}

}

