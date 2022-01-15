package com.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSortWordsInSentence {

	public static String SortWordsInSentence(String str) {
		String[] strings = str.split(" ");
		List<String> list = new ArrayList<String>();
		for(String s : strings) {
			list.add(s);
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(String s : list) {
			sb.append(s + " ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String sentence = "this this is is a what how what is";
		System.out.println(SortWordsInSentence(sentence)); 


	}

}
