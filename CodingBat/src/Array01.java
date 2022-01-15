import java.util.Arrays;

public class Array01 {

	//6 appears
	public static boolean firstlast6(int[] nums) {
		if(nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}
	
	//array length greater than 1 and first last equal
	public static boolean samefirstlast(int[] nums) {
		if(nums.length>1) {
			if(nums[0] == nums[nums.length-1]) {
				return true;
			}
		}
		if(nums.length==1) {
			return true;
		}
		return false;
	}
	
	//return pi
	public static int[] makePi() {
		return new int[] {3,1,4};
	}
	
	//two array same first or last
	public static boolean commomEnd(int[] a, int[] b) {
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
		}
		return false;
	}
	
	//array length 3, return sum
	
	public static int sum3(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}
	
	//rotate array
	public static int[] rotateLeft3(int[] nums) {
			int temp = nums[0];
			nums[0] = nums[nums.length-1];
			int temp2 = nums[1];
			nums[1] = temp;
			nums[2] = temp2;
			return nums;
	}
	
	//reverse
	public static int[] reverse3(int[] nums) {
		int[] newNums = new int[nums.length]; 
		int k = 0;
		for(int i = nums.length-1; i >= 0; i--) {
			newNums[k] = nums[i];
			k++;
		}
		return newNums;
	}
		
	public static void main(String[] args) {
		
		
		int[] r = rotateLeft3(new int[] {4, 1, 2}); //9 5 11
		System.out.println(Arrays.toString(r));
	}

}
