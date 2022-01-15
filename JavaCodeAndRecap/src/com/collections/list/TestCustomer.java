package com.collections.list;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TestCustomer {
	public static void main(String[] args) {
		
		List<Customer> list = new ArrayList<Customer>();
		
		Customer c1 = new Customer("sudip", 32);
		Customer c2 = new Customer("jayesh", 12);
		Customer c3 = new Customer("pradeep", 15);
		Customer c4 = new Customer("suresh", 30);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		

		System.out.println(list.get(0).name);
		System.out.println(list.get(1).name);
		System.out.println(list.get(2).name);
		System.out.println(list.get(3).name);
		
		
		Collections.sort(list, new CustomerNameComparator());
		
		System.out.println();
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(1).name);
		System.out.println(list.get(2).name);
		System.out.println(list.get(3).name);
		
		System.out.println();

		System.out.println(list.get(0).srNo);
		System.out.println(list.get(1).srNo);
		System.out.println(list.get(2).srNo);
		System.out.println(list.get(3).srNo);
		
		Collections.sort(list, new CustomerSerialComparator());
		
		
		System.out.println();

		System.out.println(list.get(0).srNo);
		System.out.println(list.get(1).srNo);
		System.out.println(list.get(2).srNo);
		System.out.println(list.get(3).srNo);
		
		
		ArrayList<Customer> list2 = new ArrayList<Customer>();
		
		Customer c5 = new Customer("rahul", 11, 1100);
		Customer c6 = new Customer("neeraj", 45, 3000);
		Customer c7 = new Customer("rohit", 20, 1300);
		Customer c8 = new Customer("rishabh", 17, 600);
		
		list2.add(c5);
		list2.add(c6);
		list2.add(c7);
		list2.add(c8);
		
		System.out.println();
		
		System.out.println("srNo: " + list2.get(0).srNo + " bill: " + list2.get(0).bill);
		System.out.println("srNo: " + list2.get(1).srNo + " bill: " + list2.get(1).bill);
		System.out.println("srNo: " + list2.get(2).srNo + " bill: " + list2.get(2).bill);
		System.out.println("srNo: " + list2.get(3).srNo + " bill: " + list2.get(3).bill);
		
		
		//cool part
		//can compare based on more than one attribute using .thenComparing()
		
		Collections.sort(list2, new CustomerSerialComparator().thenComparing(new CustomerBillComparator()));
		
		System.out.println();
		
		System.out.println("comparing based on srNo first and then bill");
		
		System.out.println("srNo: " + list2.get(0).srNo + " bill: " + list2.get(0).bill);
		System.out.println("srNo: " + list2.get(1).srNo + " bill: " + list2.get(1).bill);
		System.out.println("srNo: " + list2.get(2).srNo + " bill: " + list2.get(2).bill);
		System.out.println("srNo: " + list2.get(3).srNo + " bill: " + list2.get(3).bill);
		
		Collections.sort(list2, new CustomerBillComparator().thenComparing(new CustomerSerialComparator()));
		
		System.out.println();
		
		System.out.println("comparing based on bill first and then srNo");
		
		System.out.println("srNo: " + list2.get(0).srNo + " bill: " + list2.get(0).bill);
		System.out.println("srNo: " + list2.get(1).srNo + " bill: " + list2.get(1).bill);
		System.out.println("srNo: " + list2.get(2).srNo + " bill: " + list2.get(2).bill);
		System.out.println("srNo: " + list2.get(3).srNo + " bill: " + list2.get(3).bill);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
