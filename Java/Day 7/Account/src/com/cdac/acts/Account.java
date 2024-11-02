package com.cdac.acts;

import java.util.Date;

public abstract class Account {
	
	private long accNo;
	private String accName;
	private Date dopen;
	private double amount;
	
	private static long accNoGenerator= 12340001;
	
	public Account() {
		this.accNo = accNoGenerator++;
		this.accName = "";
		this.dopen = null;
		this.amount = 0.0;	
	}
	
	public Account(String accName, Date dopen, double amount) {
		this.accNo = accNoGenerator++;
		this.accName = accName;
		this.dopen = dopen;
		this.amount = amount;
	}
	
	
	public void setAccName(String accName){
		this.accName = accName;
	}
	public String getAccName() {
		return accName;
	}
	public void setDateOfOpening(Date date) {
		this.dopen = date;
	}
	public Date getDateOfOpening() {
		
		return dopen;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	
	
	public abstract double applyInterest();
	
	public String toString() {
		return "Account Number = "+accNo+", Account Name = "+accName+", Date of Opening = "+ DateUtils.getFormattedDate(dopen) +", Amount = "+amount;
	}

}
