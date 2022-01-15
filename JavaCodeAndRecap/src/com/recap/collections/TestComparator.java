package com.recap.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class TestComparator {
	
	private static class NotComparable implements Comparable<NotComparable>{
		private int i;
		private NotComparable(final int i) {
			this.i = i;
		}
		@Override
		public int compareTo(NotComparable o) {
			if(i < o.i) {
				return -1;
			}
			else if(i > o.i) {
				return 1;
			}
			else {
				return i-o.i;
			}
		}
		
	}

	public static void main(String[] args) {
		
		//sort using comparator
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(-3, -5, 1, 7, 4, -2));
		Collections.sort(numbers, new ReverseNumericOrder());
		System.out.println(numbers);
		
		//sort without comparable
		final List<NotComparable> objects = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			objects.add(new NotComparable(i));
		}
		Arrays.sort(objects.toArray()); //ClassCastException if NotComparable does not implement Comparable interface
		System.out.println(objects.toArray());
	}

}
