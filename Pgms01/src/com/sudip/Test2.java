package com.sudip;
import java.util.*;

public class Test2 {
	
	public static String getHailStone(int n){
		List<Integer> list = new ArrayList<Integer>();
			while(n != 1){
				list.add(n);
			if(n % 2 == 0){
				n = n / 2;
				}
				else{
					n = 3 * n + 1;
				}
			}
			list.add(n);
			return list.toString();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = getHailStone(3);
		System.out.println(s);
	}

}
