package com.recap.collections;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class TestMap {

	public static void main(String[] args) {
		
		Map<Library, String> map1 = new TreeMap<Library, String>();
		
		Library lib01 = new Library("a", "linking", 33000);
		Library lib02 = new Library("b", "george", 12000);
		Library lib03 = new Library("c", "gabriel", 23000);
		Library lib04 = new Library("d", "margaret", 17000);
		Library lib05 = new Library("e", "delia", 18000);
		Library lib06 = new Library("f", "harper", 10000);
		
		map1.put(lib01, lib01.bookAuthor);
		map1.put(lib02, lib02.bookAuthor);
		map1.put(lib03, lib03.bookAuthor);
		map1.put(lib04, lib04.bookAuthor);
		map1.put(lib05, lib05.bookAuthor);
		map1.put(lib06, lib06.bookAuthor);
		
		
		//keySet() -> return the objects that occur as key associations in the map
		//the value returned by this method implements Set<T> interface.
		
		//using keySet and for
		Set<Library> set01 = map1.keySet();
		for(Library key : set01) {
			String nameValue = key.bookName;
			String authorValue = key.bookAuthor;
			System.out.println("book name : " + nameValue + ", " + "bookAuthor : " + authorValue);
		}
		
		//using keySet and iterator
		Set<Library> set1 = map1.keySet();
		Iterator<Library> iter = set1.iterator();
		while(iter.hasNext()) {
			Library key = iter.next();
			String value = map1.get(key);
			System.out.println("key = " + key + " and " + " value = " + value);
		}
		
		
		for(Library key : map1.keySet()) {
			String value = map1.get(key);
			System.out.println("key = " + key + " and " + " value = " + value);
		}
		
		//map.values() -> returns all the objects that occur as values in the associations 
		// in the map.
		
		
		Collection<String> mapVal = map1.values();
		Iterator<String> valIter = mapVal.iterator();
		while(valIter.hasNext()) {
			String value = valIter.next();
			System.out.println("value = " + value);
		}
		
		
		
		Collection<String> values = map1.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		
		//map.entrySet() -> returns a set that contains all the association in the map
		//return a set that contains all the associations from the map
		
		Set<Map.Entry<Library, String>> entries = map1.entrySet();
		
		//using Iterator
		Iterator<Map.Entry<Library, String>> iterEntries = entries.iterator();
		while(iterEntries.hasNext()) {
			Map.Entry<Library, String> entry = iterEntries.next();
			Library key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = " + key + " , " + "value = " + value);
		}
		
		//using for
		System.out.println();
		
		
		for(Map.Entry<Library, String> entry : entries) {
			Library key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key = " + key + " , " + " value = " + value );
		}
		
	}

}
