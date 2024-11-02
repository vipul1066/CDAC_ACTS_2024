package com.cdac.acts;

import java.util.Date;

public class DepositAccount extends Account {
	
	private int intersetPerc = 8;
	
	
	public DepositAccount(){
		super();

	}
	
	public DepositAccount(String accName, Date date, double amount) {
		super(accName, date, amount);

	}
	
	public double applyInterest() {
		double interestAmount = (intersetPerc * super.getAmount())/100.0;
		return super.getAmount() + interestAmount;
	}

	public String toString() {
		return "Deposit Account [ " + super.toString() + "\nTotal Amount with Interest = "+applyInterest()+" ] ";
	}


}
