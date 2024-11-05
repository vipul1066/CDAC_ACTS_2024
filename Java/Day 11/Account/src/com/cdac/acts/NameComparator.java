package com.cdac.acts;

import java.util.Comparator;

public class NameComparator implements Comparator<Account>{
	public int compare(Account a1, Account a2) {
		return a1.getAccName().compareTo(a2.getAccName());
	}
}
