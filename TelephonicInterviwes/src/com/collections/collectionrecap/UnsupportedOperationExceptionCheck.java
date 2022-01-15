package com.collections.collectionrecap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnsupportedOperationExceptionCheck {

	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<String>(Arrays.asList("a" , "b", "c"));
		stringSet = Collections.unmodifiableSet(stringSet);
		stringSet.add("d");
		System.out.println(stringSet);
	}

}
