package com.collections.collections;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Testcoll {

	public static void main(String[] args) {
		
		LinkedList col = new LinkedList();
		
		for(String str: args)
			col.add(str);		//[1]add()
		
		System.out.println("size = "+col.size()); //[2]size()
		System.out.println("col = "+col.toString());
		
		String s = "ni";
		
		System.out.println("searching "+s+" in col = "+col.contains(s)); //[3]contains()
		
		System.out.println("removing "+s+ " in col = "+col.remove(s));	//[4]remove()
		
		System.out.println("col = "+col.toString());
		
//		while(col.contains(s))
//			col.remove(s);
		
		while(col.remove(s));
		
		System.out.println("-----------while(col.remove(s))---------------");
		
		
		System.out.println("---------counting num of elements having an i-----------------");
		//counting num of elements having an i
//		int count = 0;
//		for(Object o : col)
//		{
//			String str = (String) o;
//			System.out.println("str = "+str);
//			if(str.contains("i"))
//				count++;
//		}
//		System.out.println("count = "+count);
//		
		//col.clear(); 													//[5]clear()
		//System.out.println("col = "+col);
		
		Set settu = new TreeSet();
		
		settu.add("ondh");
		settu.add("yerad");
		settu.add("san");
		settu.add("shi");
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("----------------coll and set with elements----------");
		System.out.println("col = "+col);
		System.out.println("settu = "+settu);
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("---------------bulk ops---------------------------");
		col.addAll(settu);
		//System.out.println("removeAll() =" + col.removeAll(settu));
		//col.retainAll(settu);
		//System.out.println("retainAll() = " + col.retainAll(settu));
		System.out.println("col = "+col);
		
		Set col2 = new TreeSet(col);
		System.out.println("col2 = "+col2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
