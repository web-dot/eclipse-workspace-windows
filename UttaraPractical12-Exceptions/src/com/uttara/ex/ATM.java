package com.uttara.ex;


public class ATM{
		
	public void withDraw(Card c, double amt){
			//first perform inp validation
			//then perform business validation
			//if business validation succed perfom business logic
			if(c == null)
				throw new IllegalArgumentException("card can not be null");
			if(amt < 0)
				throw new IllegalArgumentException("amt cant be negetive");
			//B.L
			if(c.getBalance() >= amt) {
				c.setBalance(c.getBalance() - amt);
				System.out.println("kindly collect the amount");
				System.out.println("current balance in your Card is : Rs" + c.getBalance());
			}
			else {
				System.out.println("insufficient funds!!!");
			}
		}
	}
