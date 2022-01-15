package com.uttara.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStringComp {

	public static void main(String[] args) {
		
		Set col = new TreeSet();
		col.add("ShashankRedemption");
		col.add("TheOtherEarth");
		col.add("FindingNemo");
		col.add("KungfuPanda");
		col.add("Matrix");
		col.add("Matrix");
		
		System.out.println("sorted based on natural ordering without dupli "+col);

		List names = new ArrayList(col); // new ArrayList(<Collection ref>);
		// names.addAll(col);
		//for(Object o : col)
		//	names.add(o);
		names.add("Matrix");
		names.add("KungfuPanda");
		
		System.out.println("names col without sorting = "+names);
		Collections.sort(names);
		System.out.println("names col with sorting = "+names);
		
		//sort based on string length and num of digits!
		
		names.add("Matrix2");
		names.add("Rambo123");
		names.add("ABCD43");
		
		StringLengthComparator slc = new StringLengthComparator();
		StringDigitComparator sdc = new StringDigitComparator();
		
		Collections.sort(names,slc);
		System.out.println("names col with sorting by length = "+names);
		
		Collections.sort(names,sdc);
		System.out.println("names col with sorting by digits = "+names);
		
		Set tree = new TreeSet(slc);
		tree.addAll(names);
		System.out.println("sorted with no dupli based on length = "+tree);
	}

}


class StringLengthComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			return s1.length() - s2.length();
		}
		else
			throw new IllegalArgumentException("can compare only strings...");
	}
}
class StringDigitComparator implements Comparator
{
	
	public static int countDigits(String str)
	{
		if(str==null || str.equals(""))
			return 0;
		
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char c = str.charAt(i);
			
			if(Character.isDigit(c))
				count++;
		}
		return count;
	}
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			int count1 = countDigits(s1);
			int count2 = countDigits(s2);
			
			return count1 - count2;
		}
		else
			throw new IllegalArgumentException("can compare only strings...");
	}
}





