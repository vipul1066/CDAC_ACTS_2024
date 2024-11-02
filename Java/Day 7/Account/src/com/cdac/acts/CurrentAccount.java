package com.cdac.acts;

import java.util.Date;

public class CurrentAccount extends Account {
		
		
		private int intersetPerc = 1;
		
		
		public CurrentAccount(){
			super();
		}
		
		public CurrentAccount(String accName, Date date, double amount) {
			super(accName, date, amount);
		}
		
		public double applyInterest() {
			double interestAmount = (intersetPerc * super.getAmount())/100.0;
			return super.getAmount() + interestAmount;
		}
		
		public String toString() {
			return "Current Account [ " + super.toString() + "\nTotal Amount with Interest = "+applyInterest()+" ] ";
		}


}
