package com.cdac.acts;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account>{
	public int compare(Account a1, Account a2) {
		return a1.getBalance().compareTo(a2.getBalance());
	}

}
