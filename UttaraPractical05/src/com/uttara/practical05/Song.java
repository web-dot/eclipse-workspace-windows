package com.uttara.practical05;

class Song{
	
	private String name;
	private String lyrics;
	
	
	public Song() {
		System.out.println("in Song no arg constr");
	}
	
	public Song(String name, String lyrics) {
		this.name = name;
		this.lyrics = lyrics;
		System.out.println("in Song clas parameterized constructor");
	}
	
	
	
	public void play() {
		System.out.println(this.lyrics);
	}
	
	public void setName(String name) {
		if(name != null && name != " ") {
			this.name = name;
		}
		else {
			throw new IllegalArgumentException("kindly input valid name");
		}
	}
	public void setLyrics(String lyrics) {
		if(lyrics != null && lyrics != " ") {
			this.lyrics = lyrics;
		}
		else {
			throw new IllegalArgumentException("kindly input valid lyrics");
		}
	}
	public String getName() {
		return name;
	}
	public String getLyrics() {
		return lyrics;
	}
}
