package com.staticchecking;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HailstoneSeq {
	public static List<Integer> hailstoneseq(int n) {
		//int[] a = new int[100];  // <==== DANGER WILL ROBINSON
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (n != 1) {
		    //a[i] = n;
			list.add(n);
		    i++;  // very common shorthand for i=i+1
		    if (n % 2 == 0) {
		        n = n / 2;
		    } else {
		        n = 3 * n + 1;
		    }
		}
		//a[i] = n;
		list.add(n);
		i++;
		return list;
	}

	public static void main(String[] args) {
		List<Integer> r = hailstoneseq(2);
		System.out.println(r);
	}

}
