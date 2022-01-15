package com.collections.list;
import java.util.Comparator;

public class CustomerBillComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.bill - c2.bill;
	}
}
