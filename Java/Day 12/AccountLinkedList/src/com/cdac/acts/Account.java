package com.cdac.acts;
import java.time.LocalDate;

public class Account {
	private Integer accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private Double balance;
	private static Integer accGenerator= 123456;
	public Account() {
		this.accNo = accGenerator++;
		this.accName = "";
		this.dateOfOpening = null;
		this.balance = 0.0;
	}
	
	public Account(String accName, LocalDate dateOfOpening, Double balance) {
		this.accNo = accGenerator++;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}
	
	
	
	

}
