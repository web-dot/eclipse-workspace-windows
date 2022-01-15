package com.uttara.lab07;

class Song{
	
	private String name;
	private String lyrics;
	
	//CONSTRUCTOR01
	public Song(String name, String lyrics) {
		if(validate(name, lyrics)) {
		this.name = name;
		this.lyrics = lyrics;
		}
		else {
			throw new IllegalArgumentException("name or lyrics is invalid please check");
		}
		System.out.println("in Song class double argument cons");
	}
	//CONSTRUCTOR02
	public Song(String name) {
		if(name != null && name != " ") {
		this.name = name;
		}
		else {
			throw new IllegalArgumentException("kindly input valid name");
		}
		System.out.println("in Song class single argument  cons");
	}
	
	
	
	//VALIDATE METHOD
	public boolean validate(String name, String lyrics) {
		if(name == null || name == " " || name == "" || lyrics == null || lyrics == " " || lyrics == "") {
			return false;
		}
		return true;
	}
	
	
	//INSTANCE METHOD
	public void play() {
		System.out.println(this.lyrics);
	}
	
	
	//SETTERS AND GETTERS
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
