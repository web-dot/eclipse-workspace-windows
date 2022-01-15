package com.collections.treehash;


public class Library implements Comparable<Library>{
	String bookName;
	int copies;
	int pages;
	
	public Library(String bookName, int copies) {
		this .bookName = bookName;
		this.copies = copies;
	}
	public Library(String bookName, int copies, int pages) {
		this.bookName = bookName;
		this.copies = copies;
		this.pages = pages;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + copies;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Library other = (Library)obj;
			if(bookName.equals(other.bookName) && copies == other.copies) {
				return true;
			}
			else {
				return false;
			}
		}catch(Exception e) {
			//catch NullPointerException if obj is null
			//catch ClassCastException if obj is not of type Library
			return false;
		}
	}

	@Override
	public int compareTo(Library other) {
		if(bookName.compareTo(other.bookName) < 0) {
			return -1;
		}
		if(bookName.compareTo(other.bookName) > 0) {
			return 1;
		}
		else {
			return bookName.compareTo(other.bookName);
		}
	}
}
