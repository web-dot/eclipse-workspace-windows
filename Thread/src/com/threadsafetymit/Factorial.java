package com.threadsafetymit;
import java.math.*;


public class Factorial {
	/*computes n! and prints it on standard output*/
	private static void computeFact(final int n) {
		BigInteger result = new BigInteger("1");
		for(int i = 1; i <= n; ++i) {
			System.out.println("working on fact " + n);
			String a = String.valueOf(i);
			System.out.println("a = " + a);
			result = result.multiply(new BigInteger(a));
			System.out.println("result = " + result);
		}
		System.out.println("fact(" + n + ") = " + result);
	}
		public static void main(String[] args) {
			new Thread(new Runnable() {
				public void run() {
					computeFact(99);
				}
			}).start();
			computeFact(100);
		}
}



