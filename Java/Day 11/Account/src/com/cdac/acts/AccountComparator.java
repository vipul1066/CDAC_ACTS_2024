package com.cdac.acts;
import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
	public int compare(Account a1, Account a2) {
		return a2.getAccNo().compareTo(a1.getAccNo());
	}	

}
