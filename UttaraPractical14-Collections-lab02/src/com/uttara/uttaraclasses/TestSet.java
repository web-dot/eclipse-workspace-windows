package com.uttara.uttaraclasses;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		String s1 = new String("Wedding Pulav");
		String s2 = new String("Wedding Pulav");
		String s3 = new String("Plus"); 
				
		System.out.println("is s1 eq to s2 ? "+s1.equals(s2));
		System.out.println("s1.hashCode() = "+s1.hashCode());
		System.out.println("s2.hashCode() = "+s2.hashCode());
		System.out.println("is s1 eq to s3 ? "+s1.equals(s3));
		System.out.println("s3.hashCode() = "+s3.hashCode());

		Set hs = new HashSet();
		System.out.println("adding s1 into hs = "+hs.add(s1));
		System.out.println("adding s2 into hs = "+hs.add(s2));
		System.out.println("adding s3 into hs = "+hs.add(s3));
		System.out.println(hs);
		
	}

}







