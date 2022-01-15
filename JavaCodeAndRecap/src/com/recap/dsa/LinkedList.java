package com.recap.dsa;

public interface LinkedList {
	public void add(int data);
	public void insertAtBeginning(int data);
	public void insertAt(int data, int position);
	public boolean contains(int data);
	public void deleteAt(int position);
	public void print();
	public int get(int position);
	public int size();
	public boolean isEmpty();
	public void clear();
}
