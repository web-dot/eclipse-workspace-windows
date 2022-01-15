package com.collections.treehash;
import java.util.Comparator;

public class LaboratoryStockComparator implements Comparator<Laboratory> {
	@Override
	public int compare(Laboratory l1, Laboratory l2) {
		return l1.stock - l2.stock;
	}
}
