package com.recap.collections;

public class Library implements Comparable<Library> {
	String bookName;
	String bookAuthor;
	int noOfCopy;
	
	public Library(String name, String author, int copy) {
		this.bookName = name;
		this.bookAuthor = author;
		this.noOfCopy = copy;
	}
	@Override
	public int compareTo(Library other) {
		if(bookName.compareTo(other.bookName) < 0) {
			return -1;
		}
		else if(bookName.compareTo(other.bookName) > 0) {
			return 1;
		}
		else {
			return bookName.compareTo(other.bookName);
		}
	}
}
