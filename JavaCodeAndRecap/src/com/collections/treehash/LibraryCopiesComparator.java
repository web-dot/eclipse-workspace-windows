package com.collections.treehash;
import java.util.Comparator;

public class LibraryCopiesComparator implements Comparator<Library> {
	@Override
	public int compare(Library l1, Library l2) {
		return l1.copies - l2.copies;
	}
}
