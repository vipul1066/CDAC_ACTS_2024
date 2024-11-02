package com.cdac.acts;

import java.util.Date;

public class SavingAccount extends Account {
	
	
	private int intersetPerc = 3;
	
	public SavingAccount(){
		super();
	}
	
	public SavingAccount(String accName, Date date, double amount) {
		super(accName, date, amount);
	}
	
	public double applyInterest() {
		double interestAmount = (intersetPerc * super.getAmount())/100.0;
		return super.getAmount() + interestAmount;
	}
	
	
	
	public String toString() {
		return "Saving Account [ " + super.toString() + "\nTotal Amount with Interest = "+applyInterest()+" ] ";
	}

}
