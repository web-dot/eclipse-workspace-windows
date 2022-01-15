package com.collections.list;
import java.util.Comparator;

public class CustomerSerialComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.srNo - c2.srNo;
	//	return c2.srNo - c1.srNo; // for descending
	}
}
