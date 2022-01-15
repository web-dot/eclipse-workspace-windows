package com.recap.other;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;


public class Test {
//take input for 2 numbers and find their lcm
	public static int returnLcm() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sa = s.split(" ");
		int num1 = Integer.parseInt(sa[0]);
		int num2 = Integer.parseInt(sa[1]);
		int num3 = Integer.parseInt(sa[2]);
		
		int lcm = num1 * num2 * num3;
		for(int i = num1 * num2 * num3; i > 0; i--) {
			if(i % num1 == 0 && i % num2 == 0 && i % num3 == 0) {
				lcm = i;
			}
		}
		return lcm;
	}
	
	public static int returnHcf() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sa = s.split(" ");
		int num1 = Integer.parseInt(sa[0]);
		int num2 = Integer.parseInt(sa[1]);
		
		int hcf = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}
	
	public static void main(String[] args) throws IOException {
	
			int r = returnHcf();
			System.out.println(r);
	}

}
