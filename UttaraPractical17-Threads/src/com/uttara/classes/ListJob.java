package com.uttara.classes;

import java.math.BigDecimal;
import java.util.List;
import java.math.BigDecimal;

public class ListJob implements Runnable{

	List<Integer> list;
	BigDecimal val;
	
	public ListJob(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		BigDecimal sum = new BigDecimal(0);
		for(Integer i : list) {
			sum = sum.add(new BigDecimal(i));
		}
		val = sum;
	}
	
	
	public BigDecimal getVal() {
		return val;
	}
}
