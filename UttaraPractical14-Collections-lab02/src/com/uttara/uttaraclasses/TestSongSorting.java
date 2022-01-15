package com.uttara.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Song implements Comparable
{
	private String name;
	private int length;
	private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Song(String name, int length, int rating) {
		super();
		this.name = name;
		this.length = length;
		this.rating = rating;
	}
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Song)
		{
			Song s = (Song) obj;
			if(this.name.equals(s.name)&&this.length==s.length&&this.rating==s.rating)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		
		return (name+length+rating).hashCode();
	}
	@Override
	public String toString() {
		return "Song:"+name+","+length+","+rating;
				
	}
	 
	@Override
	public int compareTo(Object o) {
		if(o instanceof Song)
		{
			Song s = (Song) o;
			return this.name.compareTo(s.name);
		}
		else
			throw new IllegalArgumentException("song only should be passed");
	}
	
	
	
}

public class TestSongSorting {

	public static void main(String[] args) {
		
		Song s1 = new Song("HumDilDeChukeSanam",20,7);
		Song s2 = new Song("HodiMaga",5,6);
		Song s3 = new Song("Dance Raja Dance",3,5);
		Song s4 = new Song("HumTumkoKyunKiSimplyKuchKuchHogaya",4,10);
		Song s5 = new Song("HumTumkoKyunKiSimplyKuchKuchHogaya",4,10);
		
		List songsList = new ArrayList();
		songsList.add(s1);
		songsList.add(s2);
		songsList.add(s3);
		songsList.add(s4);
		songsList.add(s5);
		System.out.println("before sorting "+songsList);
		Collections.sort(songsList);
		System.out.println("after sorting "+songsList);
		Collections.sort(songsList,new SongLengthComparator());
		System.out.println("after sorting based on length "+songsList);
		Collections.sort(songsList,new SongRatingComparator());
		System.out.println("after sorting based on rating "+songsList);

	}

}

class SongLengthComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Song && o2 instanceof Song)
		{
			Song s1 = (Song) o1;
			Song s2 = (Song) o2;
			
			return s1.getLength() - s2.getLength();
		}
		throw new IllegalArgumentException("blah");
	}
	
}
class SongRatingComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Song && o2 instanceof Song)
		{
			Song s1 = (Song) o1;
			Song s2 = (Song) o2;
			
			return s1.getRating() - s2.getRating();
		}
		throw new IllegalArgumentException("blah");
	}
	
}




