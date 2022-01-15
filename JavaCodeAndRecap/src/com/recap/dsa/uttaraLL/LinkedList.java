package com.recap.dsa.uttaraLL;

public interface LinkedList {

	public void add(String data);
	public void print();
	public boolean contains(String data);
	public boolean isEmpty();
	public long size();
	public void insert(int pos, String data);
	public String remove(int pos);
	public String get(int pos);
}
