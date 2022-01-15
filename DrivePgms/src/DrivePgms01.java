
import java.util.Scanner;
public class DrivePgms01
{
	public static void main(String[] args)
	{
		//[1]concatenate two int numbers
		//using scanner
		
		/**
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		System.out.println("Enter number");
		int b = scan.nextInt();
		System.out.println(a + "" + b);
		**/
		
		//not using scanner
		/**
		//case1
		String concat = "";
		for(int i = 0; i < args.length; i++)
		{
			String s1 = args[i];				//string arguments
			int x = Integer.parseInt(s1);		//conv to int
			concat = concat + x;
			System.out.println(concat);			//print
		}
		**/
		
		/**
		//case 2 and case 3
		String concat = "";
		for(int i = 0; i < args.length; i++)
		{
			String s1 = args[i];				//string arguments
			int x = Integer.parseInt(s1);		//conv to int
			//String s2 = String.valueOf(x);	//conv to String(case2)
			String s2 = Integer.toString(x);	//conv to String(case3)
			concat += s2;						//concatenate
			System.out.println(concat);			//print
		}
		**/
		
		//[2]Take input from command line argument and add them
		/**
		int sum = 0;
		for(int i = 0; i < args.length; i++)
		{
			String s = args[i];
			int x = Integer.parseInt(s);
			sum = sum + x;
			System.out.println(sum);
		}
		**/
		
		//[3]sum of first n numbers(i/p -> 3, o/p -> 6)
		/**
		int sum = 0;
		for(int i = 0; i <= args.length - 1; i++)
		{
			int x = Integer.parseInt(args[i]); //string to integer
			for(int j = 1; j <= x; j++)
				sum = sum + j;
		}
		System.out.println(sum);
		**/
		
		//[4]swap two numbers using temp
		/**
		for(int i = 0; i < 1; i++)
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			int temp = x;
			x = y;
			y = temp;
			System.out.println("x =" + x);
			System.out.println("y =" + y);
		}
		**/
		
		//[5]swap two numbers without using temp
		/**
		for(int i = 0; i < 1; i++)
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("x =" + x);
			System.out.println("y =" + y);
			x = x + y;
			y = x - y;
			x = x - y;
			System.out.println("x =" + x);
			System.out.println("y =" + y);
		}
		**/
		
		//[6]factors of given number
		/**
		int num = 0;
		for(int i = 0; i < 1; i++)
		{
			int x = Integer.parseInt(args[i]);
			for(int j = 1; j <= x; j++)
				if(x % j == 0)
				{
					num += 1;											//count number of factors
					System.out.println("factor of  " + x + " = " + j);	//print the factor
				}
				System.out.println("total number of factors = " + num);		//print number of factors
		}
		**/
		
		
		
		//[7]number of factors of given number
		/**
		int num = 0;
		for(int i = 0; i < 1; i++)
		{
			int x = Integer.parseInt(args[i]);
			//System.out.println(x);
			for(int j = 1; j <= x; j++)
				if(x % j == 0)
					num += 1;
				System.out.println(num);
		}
		**/
		
		//[8]to check if number is prime number
		/**
		int count = 0;
		int x = 0;
		for(int i = 0; i < 1; i++)
		{
			x = Integer.parseInt(args[i]);
			//System.out.println(x);
		}
		for(int j = 2; j < x; j++)
		{
			if(x % j == 0)
			{
				count++;
				//System.out.println(count);
			}
		}
		if(count > 0 || x == 1)
			System.out.println(x + " is not a prime number");
		else
			System.out.println(x + " is a prime number");
		**/
		
		
		//[9]all prime factors of a number
		/**
		refactor
		int num = 0;
		for(int i = 0; i < 1; i++)
		{
			int x = Integer.parseInt(args[i]);
			for(int j = 1; j <= x; j++)
				if(x % j == 0)
				{
					num += 1;											//count number of factors
					//System.out.println("factor of  " + x + " = " + j);	//print the factor
					if((j % 1 == 0 && j % j == 0) && (j % x != 0))
						System.out.println(j + " is prime");
					else
						System.out.println(j + " is not prime");
				}
				//System.out.println("total number of factors = " + num);		//print number of factors
		}
		**/ 
		
		//[10]prime number within a range
		/**
		int start = 0;
		int end = 0;
		for(int i = 0; i < 1; i++)
		{
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
			//System.out.println(start);
			//System.out.println(end);
		}
		for(int j = start; j <= end; j++)
		{
			int count = 0;
			//System.out.println(j);
			for(int k = 1; k <= j; k++)
			{
				if(j % k == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(j);
			}
		}
		**/
		
		//[11]Sum of prime numbers within the range
		/**
		int start = 0;
		int end = 0;
		int sum = 0;
		//acces command line arguments using for loop
		for(int i = 0; i < 1; i++)
		{
			start = Integer.parseInt(args[0]);
			end   = Integer.parseInt(args[1]);
		}
		//check number of factors for each element using nested for
		for(int j = start; j <= end; j++)
		{
			int count = 0;
			for(int k = 1; k <= j; k++)
			{
				if(j % k == 0)
				{
					count++;
				}
			}
			//if elemnt has exactly two factors, i.e 1 and the element itself it is a prime number
			if(count == 2)
			{
				//System.out.println("j = " + j);
				sum = sum + j;					//add the number to sum
			}
		}
		System.out.println("sum = " + sum);
		**/
		
		//[12]sum of numbers from given digit
		//using scanner
		
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		int num = 0;
		int sum = 0;
		while(a != 0)
		{
			num = a % 10;
			sum = sum + num;
			a = a / 10;
		}
		System.out.println(sum);
		**/
		
		//[13]sum of last two digits from a given number
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		int sum = 0;
		int num = 0;
		int i = 1;
		while(i <= 2)
		{
			num = a % 10;
			sum = sum + num;
			a = a / 10;
			i++;
		}
		System.out.println("sum of last two digits = " + sum);
		**/
		
		
		//[14]twin prime numbers within the given range
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a = sc.nextInt();
		System.out.println("Enter the second value");
		int b = sc.nextInt();
			
		for(int i = a; i < b; i++)
		{
			boolean g = prime(i);
			boolean h = prime(i + 2);
			if(g && h)
			{
				System.out.println("[" + i + ", " + (i+2) + "]");
			}
		}
		**/
		//prime() subroutine defined below**
		
		//[15]print prime factors of a number
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter first value");
		//int a = sc.nextInt();
		
		//my approach
		/**
		for(int i = 1; i <= a; i++)
		{
			int count = 0;
			//System.out.println();	
			for(int j = 1; j <= i; j++)
			{
				if(i % j == 0)
				{
					//System.out.println(j);
					count++;
				}
				
			}
			//System.out.println();
			if((count == 2) && (a % i == 0))
			{
				System.out.println(i + " is a prime factor of: " + a);
			}
		}
		**/
		
		//alt approach
		/**
		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0)
			{
				int count = 0;
				for(int j = 1; j <= i; j++)
				{
					if(i % j == 0)
					{
						count++;
					}
				}
				if(count == 2)
				{
					System.out.println(i);
				}
			}
		}
		**/

		//[16]sum of factors of a given number
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0)
			{
				sum += i;
			}
		}
		System.out.println("sum of factors of " + a + " = " + sum);
		**/
		
		//[17]find factorial of the number
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		double a = sc.nextDouble();
		double product = 1;
		for(int i = 1; i <= a; i++)
		{
			product *= i;
		}
		if(a == 0)
		{
			product = 0;
		}
		System.out.println(product);
		**/
		
		//[18]find largest prime factor of a number
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = sc.nextInt();
		int biggestPrime = 0;
		for(int i = 1; i <= a; i++)
		{
			if(a == 0)
				break;
			int count = 0;
			//int biggestPrime = 0;
			for(int j = 1; j <= i; j++)
				if(i % j == 0)
				{
					count++;
				}
				if((count == 2) && (a % i == 0))
				{
					biggestPrime = i;
				}
		}
		System.out.println("biggest prime factor is " + biggestPrime);
		**/

		//[18]fibonacci series
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		double num = sc.nextDouble();
		int a = 0, b = 1, c;
		//System.out.println(a + " " + b);
		for(int i = 2; i < num; i++)
		{
			c = a + b;
			System.out.println(""+c);
			a = b;
			b = c;
		}
		**/
		
		//[19]find the frequency of a digit in a number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Enter digit");
		int d = sc.nextInt();
		int count = 0;
		while(n > 0)
		{
			int r = n % 10;
			if(r == d)
			{
				++count;
			}
			n = n / 10;
		}
		System.out.println(count);
		
		/**
		for(int i = 0; i < 1; i++)
		{
			//System.out.println(args[i]);
			String s = args[0];
			String v = args[1];
			System.out.println(s);
			System.out.println(v);
			System.out.println(s.equals(v));
		}
		**/
		
		/**
		//basic iteration
		System.out.println("length of args= " + args.length);
		for(int i = 0; i < args.length; i++)
		{
			String s = args[i];
			System.out.println("arg at " + i + "th pos = " + s);
		}
		System.out.println("using for each");
		for(String x: args)
		System.out.println(x);
		**/
	}
	
	//subroutine to check if the number is prime
	static boolean prime(int m)
	{
		int count = 0;
		for(int j = 1; j <= m; j++)
		{
			if(m % j == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else 
			return false;
	}
}
