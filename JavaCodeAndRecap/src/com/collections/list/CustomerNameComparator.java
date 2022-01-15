package com.collections.list;
import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return c2.name.compareTo(c1.name);
	//	return c1.name.compareTo(c2.name); //for descending
	}
}
