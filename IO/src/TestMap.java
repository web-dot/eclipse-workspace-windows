import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;


 class Person{
	public String name ;
	public int age;
	boolean lucky;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean checkLuck() {
		if(name.startsWith("r") && age < 21) {
			lucky = true; 
		}
		else
			lucky = false;
		return lucky;
	}
}




public class TestMap {

	public static void main(String[] args) {
		
		Person p1 = new Person("dip", 35);
		Person p2 = new Person("roy", 19);
		
		//System.out.println(p2.checkLuck());
		//System.out.println(p1.checkLuck());
		
		
		Map<String, Boolean> luckMap = new HashMap<String, Boolean>();
		luckMap.put(p1.name, p1.checkLuck());
		luckMap.put(p2.name, p2.checkLuck());
		
		System.out.println(luckMap.get(p1.name));
		System.out.println(luckMap.get(p2.name));
		
		System.out.println("Set of keys in luckMap");
		Set<String> luckKeys = luckMap.keySet();
		System.out.println("keys = " + luckKeys);
		
		System.out.println("Collection of values in luckMap");
		Collection<Boolean> luckValue = luckMap.values();
		System.out.println("values = " + luckValue);
		
		
		
		
		//get a Iterator<T>
		Iterator<String> iter1 = luckKeys.iterator();
		
		System.out.println("iterate using Iterator<T>");
		while(iter1.hasNext()) {
			String key = iter1.next();
			boolean value = luckMap.get(key);
			System.out.println("[key :" + key + ", value: " + value + "]");
		}
		System.out.println("iterate using enhanced for");
		for(String key : luckKeys) {
			boolean value = luckMap.get(key);
			System.out.println("[key :" + key + ", value: " + value + "]");
		}
		
		
		System.out.println(".entrySet()");
		
		Set<Map.Entry<String, Boolean>> entries = luckMap.entrySet();
		
		System.out.println("iterate using enhanced for");
		for(Map.Entry<String, Boolean> entry : entries) {
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------------");
		
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(141, 1);
		map.put(142, 2);
		System.out.println(map.get(141));
		System.out.println(map.containsKey(142));
		System.out.println(map.containsValue(1));
		System.out.println(map.size());
		//map.clear();
		System.out.println(map.isEmpty());
		
		System.out.println();
		
		//.keySet() -> returns a Set 
		Set<Integer> keys = map.keySet();
		System.out.println("keys = " + keys);
		
		
		//.values() -> returns a Collection
		Collection<Integer> values = map.values();
		System.out.println("values = " + values);
		
		System.out.println();
		
		//ITERATION
		//using Iterator
		Iterator<Integer> iter = keys.iterator();
		System.out.println("USING Iterator<>");
		while(iter.hasNext()) {
			int key = iter.next();
			int value = map.get(key);
			System.out.println("[key :" + key + ", value: " + value + "]");
		}
		//using enhaced for
		System.out.println("using enhanced for");
		for (Integer key : keys) {
			int value = map.get(key);
			System.out.println("[key :" + key + ", value: " + value + "]");
		}
	}

}
