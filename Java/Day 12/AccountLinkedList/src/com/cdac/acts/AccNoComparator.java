package com.cdac.acts;

import java.util.Comparator;

public class AccNoComparator implements Comparator<Account> {
	public int compare(Account a1, Account a2) {
		return a1.getAccNo().compareTo(a2.getAccNo());
	}

}
