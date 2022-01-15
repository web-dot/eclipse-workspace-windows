package com.uttara.practical02;

public class CheckTernary {

	public static void main(String[] args) {
		
		
		//10 ternary op
		System.out.println(1 == 1 ? 5 : 6);
		System.out.println(1 == 2 ? 5 : 6);
		System.out.println(1 == 1 ? true : false);
		System.out.println(1 ==1 ? false : true);
		
		System.out.println(true ? false : true);
		System.out.println(true ? true : false);
		
		char x = 'X';
		int i = 0;
		
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
		
		
		//11
		int i1 = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t&(i++) == 0);
		//b = (f&(i+=2) > 0);
		System.out.println(b);
		
		
		//12
		
		int i2 = 55;
		int j = 55;
		while(i2<=j && j<=i & i2==j) { //short circuit // false && anything is flase, so no sop
			System.out.println("Abc");
		}
	}

}
