package com.uttara.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSongCollections {

	public static void main(String[] args) {
		
		List songs = new ArrayList();
		Song s1 = new Song("ChaiyaChaiya","SukhwinderSingh",8,4);
		Song s2 = new Song("Sunshine","NorahJones",9,5);
		Song s3 = new Song("Om","??",7,5);

		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s3);
		songs.add(s3);
		
		System.out.println("before sorting "+songs);
		Collections.sort(songs);
		System.out.println("after sorting "+songs);

	}

}

class Song implements Comparable
{
	private String name;
	private String singer;
	private int time;
	private int rating;
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Song)
		{
			Song s = (Song) o;
			return this.time - s.time;
		}
		else
			throw new IllegalArgumentException("only songs can be compared");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Song(String name, String singer, int time, int rating) {
		super();
		this.name = name;
		this.singer = singer;
		this.time = time;
		this.rating = rating;
	}
	public Song() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		result = prime * result + time;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + ", time=" + time
				+ ", rating=" + rating + "]";
	}
	
}










