import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class DrivePgms03 {
	//check if a number is prime
	public static boolean checkPrime(int n) {
		if(n == 1 || n == 2) {
			return true;
		}
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
				//System.out.println(count);
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	//prime factors of a num
	public static List<Integer> primeFactors(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= num; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2 && num % i == 0) {
				list.add(i);
			}
		}
		return list;
	}
	
	//prime number within a range
	public static List<Integer> primesInRange(int range) {
		List<Integer> list = new ArrayList<Integer>();
		if(range <= 3) {
			for(int i = 1; i < range; i++) {
				list.add(i);
			}
		}
		else {
		for(int i = 0; i < range; i++) {
			int count = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 1) {
				list.add(i);
				}
			}
		}
		return list;
	} 
	
	//sum of primes within a range
	public static int sumPrimes(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		return sum ;
	}
	
	//sum of digits of a number
	public static int sumDigits(int n) {
		int sum = 0;
		//int count = 0;
		while(n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
			//count++;
		}
		return sum;
	}
	
	//sum of last two digits of a number
	public static int sumLastTwo(int n) {
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}
	
	//print prime factors of a given number
	public static void printPrimes(int num) {
		for(int i = 1; i <= num; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2 & num % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	//sum of factors of a number
	public static void sumOfFactors(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				//System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	//find factorial of a number
	public static void findFactorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	//find largest prime factor of a number
	public static void largestPrimeFactor(int n) {
		int max = 0;
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count ++;
				}
			}
			if(count == 2) {
				//System.out.println(i);
				if(i > max) {
					max = i;
				}
				}
			}
		System.out.println(max);
		}
	
	//print fibonacchi sequence within range
	//REFACTOR
	public static void printFib(int n) {
		int a = 0;
		int b = 1;
		int c;		
		for(int i = 2; i < n; i++) {
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
			}
		}
	
	//find frequency of a digit in a number
	public static void printFreqOfNum(long num, int n) {
		int countNum = 0;
		int count = 0;
		while(num > 0) {
			long rem = num % 10;
			num = num / 10;
			//System.out.println(rem);
			if(rem == n) {
				countNum++;
			}
			count++;
		}
		System.out.println(countNum);
	}
	//find lowest factor of a number
	public static void findLf(int n) {
		int min = n;
		for(int i = 1; i < n; i++) {
			if(n % i == 0 && i != 1) {
				//System.out.println(i);
				if(i < min) {
					min = i;
				}
			}
		}
		System.out.println(min);
	}
	
	//print all multiples of a number
	public static void printMultiples(int n) {
		for(int i = 1; i < n; i++) {
			if(n % i == 0 & i != 1) {
				System.out.println(i + " * " + (n / i));
			}
		}
	}
	
	//print lcm of two numbers
	public static void printLcm(int x, int y) {
		//System.out.println(x * y);
		int max = 0;
		if(x > y ^ y > x) {
			max = x;
			max = y;
		}
		System.out.println(max);
		while(true) {
		if(max % x == 0 && max %  y == 0) {
			System.out.println(max);
			break;
		}
		max++;
		}
	}
	
	
	
	public static void main(String[] args) {
		//boolean b = checkPrime(48);
		//System.out.println(b);
		
		//i/o
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		//printPrimes(num);
		//sumOfFactors(num);
		//findFactorial(num);
		//largestPrimeFactor(num);
		//printFib(num);
		//printFreqOfNum(num, 5);
		//findLf(num);
		//printMultiples(num);
		printLcm(num1, num2);
		//System.out.println(r);
	}

}
