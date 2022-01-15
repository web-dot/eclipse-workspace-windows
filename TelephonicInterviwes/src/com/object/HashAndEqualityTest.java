package com.object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class HashAndEqualityTest {

	public static void main(String[] args) {
		
		Account a1 = new Account("sudip", 1100);
		Account a2 = new Account("sudip", 1100);
		//System.out.println(a1.name.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
		
		Set<Account> set = new HashSet<Account>();
		set.add(a1);
		set.add(a2);
		for(Account a : set) {
			String s = a.name;
			int bal = a.balance;
			System.out.println(s + " : " +  bal);
		}
		
		
		Map<Account, String> map1 = new HashMap<Account, String>();
		Map<Account, String> map2 = new HashMap<Account, String>();
		map1.put(a1, a1.name);
		map2.put(a2, a2.name);
		System.out.println(map1.hashCode());
		System.out.println(map2.hashCode());
		System.out.println(map1.equals(map2));
	
		
		
	}

}
