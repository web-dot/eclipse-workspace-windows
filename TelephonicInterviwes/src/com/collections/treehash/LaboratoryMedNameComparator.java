package com.collections.treehash;
import java.util.Comparator;

public class LaboratoryMedNameComparator implements Comparator<Laboratory> {
	@Override
	public int compare(Laboratory l1, Laboratory l2) {
		return l1.medName.compareTo(l2.medName);
	}
}
