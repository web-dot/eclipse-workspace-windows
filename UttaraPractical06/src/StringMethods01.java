public class StringMethods01{

	//4)swap first and last char
	public static String swapFirstWithLast(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length() > 1 || str != null || !str.isEmpty() || !str.isBlank()) {
			char[] ca = str.toCharArray();
			char t = ca[0];
			ca[0] = ca[ca.length-1];
			ca[ca.length-1] = t;
			for(char c : ca) {
				sb.append(c);
			}
			return sb.toString();
		}
		return "String is empty, nothing to swap";
	}
	
	
	//5) check palindrome
	public static boolean chekPalindrome(String str) {
		
		if(str.length() == 1) {
			return false;
		}
		else if(str.length() == 2) {
			if(str.charAt(0) == str.charAt(1)) {
				return true;
			}
		}
		else if(str.length() > 2 && str.length() % 2 == 0) {
			String sub1 = str.substring(0, str.length()/2);
			String sub2 = str.substring(str.length()/2, str.length());
			StringBuilder sb = new StringBuilder(sub2);
			String sub3 = sb.reverse().toString();
			if(sub1.equals(sub3)) {
				return true;
				}
			}
		else if(str.length() > 2 && str.length() % 2 == 1) {
			String sub1 = str.substring(0, str.length()/2);
			String sub2 = str.substring(str.length()/2 + 1, str.length());
			StringBuilder sb = new StringBuilder(sub2);
			String sub3 = sb.reverse().toString();
			if(sub1.equals(sub3)) {
				return true;
				}
		}
		return false;
	}
	
	
	//using sub
	/*
	public static int[] swapIntsUsingSub(int[] arr, int indexA, int indexB) {
		arr[indexA] = arr[indexB] - arr[indexA];
		return arr;
	}*/
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//swap chars
		String s1 = swapFirstWithLast("a");
		String s2 = swapFirstWithLast("ab");
		String s3 = swapFirstWithLast("abc");
		String s4 = swapFirstWithLast("");
		System.out.println("swap = " + s1);
		System.out.println("swap = " + s2);
		System.out.println("swap = " + s3);
		System.out.println("swap = " + s4);
		
		
		//palindrome
		boolean b1 = chekPalindrome("p");
		boolean b2 = chekPalindrome("pop");
		boolean b3 = chekPalindrome("mom");
		boolean b4 = chekPalindrome("moom");
		boolean b5 = chekPalindrome("progorp");
		boolean b6 = chekPalindrome("");
		boolean b7 = chekPalindrome("llsajflsjf");
		boolean b8 = chekPalindrome("saippuakivikauppias");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b8);
		
		
		
		System.out.println();
		//swap ints
		
		//using temporary variable
		
		int num1 = 5;
		int num2 = 7;
		System.out.println("Using temporary variable----->");
		System.out.println("num1 before swap= " + num1);
		System.out.println("num2 before swap= " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 after swap= " + num1);
		System.out.println("num2 after swap= " + num2);
		
		
		System.out.println();
		
		//using subtraction
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("Using subtraction----->");
		System.out.println("num1 before swap= " + num3);
		System.out.println("num2 before swap= " + num4);
		
		
		num3 = num3 + num4;
		num4 = num3 - num4;
		num3 = num3 - num4;
		
		System.out.println("num1 after swap= " + num3);
		System.out.println("num2 after swap= " + num4);
		
		//using bitwise exclusive OR(XOR)
		int num5 = 100;
		int num6 = 200;
		
		System.out.println();
		System.out.println("Using XOR----->");
		System.out.println("num5 before swap= " + num5);
		System.out.println("num6 before swap= " + num6);
		
		num5 = num5 ^ num6;
		num6 = num5 ^ num6;
		num5 = num5 ^ num6;
		
		System.out.println("num5 after swap= " + num5);
		System.out.println("num6 after swap= " + num6);

		
		
		
		
	}
}

