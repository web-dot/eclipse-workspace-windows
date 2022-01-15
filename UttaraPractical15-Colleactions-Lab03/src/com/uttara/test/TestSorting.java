package com.uttara.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestSorting {

	public static void main(String[] args) {
		
		String sentence = "this is that a that is this b so which is what that abracadabra that is which that";
		
		String[] words = sentence.split(" ");
		
		Set<String> sortedSet = new TreeSet<String>();
		
		for(String w:words)
			sortedSet.add(w);
		
		System.out.println("sortedSet = "+sortedSet);

		List<String> wordsList = new ArrayList<String>();
		
		for(String w:words)
			wordsList.add(w);
		
		Collections.sort(wordsList);
		
		System.out.println("wordsList = "+wordsList );
		
		StringLenComparator lenComp = new StringLenComparator();
		
		Collections.sort(wordsList,lenComp);
		System.out.println("wordsList based on length = "+wordsList );
		
		Set<String> lenSortSet = new TreeSet<String>(lenComp);
		lenSortSet.addAll(wordsList);
		System.out.println("lenSortSet = "+lenSortSet);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 3);
		map.put(2, 10);
		map.put(3, 4);
		map.put(4, 6);
		map.put(5, 4);
		
		Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		treeMap.putAll(map);
		
		System.out.println("treeMap = "+treeMap);
		
		KeyDescComparator kdc = new KeyDescComparator();
		Map<Integer,Integer> treeMap2 = new TreeMap<Integer, Integer>(kdc);
		
		treeMap2.putAll(treeMap);
		System.out.println("treeMap2 = "+treeMap2);
		
		ValueComparator vc = new ValueComparator(map);
		Map<Integer,Integer> treeMap3 = new TreeMap<Integer,Integer>(vc);
		
		treeMap3.putAll(map);
		
		System.out.println("treeMap3 = "+treeMap3);
		
		Set<Entry<Integer,Integer>> entries = treeMap3.entrySet();
		
		for(Entry<Integer,Integer> en : entries)
		{
			int key = en.getKey();
			int val = en.getValue();
			for(int i = 0 ; i < val ; i++)
			{
				System.out.print(key+" ");
			}
			System.out.println("");
		}
		
		Student s1 = new Student("Pappu",15,5);
		Student s2 = new Student("Gappu",14,3);
		Student s3 = new Student("Jappu",16,1);
		Student s4 = new Student("Lappu",13,2);
		
		Student[] sarr = new Student[4];
		sarr[0] = s1;
		sarr[1] = s2;
		sarr[2] = s3;
		sarr[3] = s4;
		
		for(int i = 0; i < sarr.length -1 ; i++ )
		{
			for(int j = 0 ; j < sarr.length - i - 1 ; j++)
			{
				if (sarr[j].getRank() > sarr[j+1].getRank())
				{
					Student temp = sarr[j];
					sarr[j] = sarr[j+1];
					sarr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(sarr));
		
		Set<Student> students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		
		
		System.out.println("students = "+students);
		Set<Student> students2 = new TreeSet<Student>(new StudentRankComparator());
		students2.addAll(students);
		System.out.println("students2 = "+students2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}



class StringLenComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		
		return o2.length() - o1.length();
	}
}

class KeyDescComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
}

class ValueComparator implements Comparator<Integer>
{
	private Map<Integer,Integer> map;
	
	public ValueComparator(Map<Integer, Integer> map) {
		super();
		this.map = map;
	}

	@Override
	public int compare(Integer k1, Integer k2) {
		
		int val1 = map.get(k1);
		int val2 = map.get(k2);
		
		return val2-val1; //desc
	}
}

//student has a name, age, rank....natural ord of
//student is to compare based on name...so sort based
//on natural ord and based on rank.

class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private int rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int rank) {
		super();
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student s = (Student) obj;
			if(this.name.equals(s.name) && this.rank == s.rank && this.age==s.age)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		return (name+age+rank).hashCode();
	}
	@Override
	public String toString() {
		return "Sudent->Name:"+name+",Age:"+age+",Rank:"+rank;
	}
	@Override
	public int compareTo(Student s) {
		
		return this.name.compareTo(s.name);
	}
	
}
class StudentRankComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRank() - o2.getRank();
	}
}













