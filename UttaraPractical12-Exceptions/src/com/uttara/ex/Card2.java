package com.uttara.ex;

class Card2
{
	private double balance;
	private String owner;
	
	public void setBalance(double d)
	{
		if(d < 0)
		{
			throw new IllegalArgumentException("balance can't be negetive");
		}
		balance = d;
	}
	public void setOwner(String o)
	{
		if(o == null || o.trim().equals(""))
		{
			throw new IllegalArgumentException("owner can't be null or blank");
		}
		owner = o;
	}
	public String getOwner()
	{
		return owner;
	}
	public double getBalance()
	{
		return balance;
	}
	public Card2()
	{
		
	}
	public Card2(String owner, double bal)
	{
		if(owner == null || owner.trim().equals(""))
		{
			throw new IllegalArgumentException("owner can't be null or blank");
		}
		if(bal < 0)
		{
			throw new IllegalArgumentException("balance can't be negetive");
		}
		this.owner = owner; 
		balance = bal;
	}
}