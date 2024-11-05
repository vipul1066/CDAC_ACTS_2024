package com.cdac.acts;

import java.util.Comparator;

public class DateComparator implements Comparator<Account>{
	public int compare(Account a1, Account a2) {
		return a1.getDateOfOpening().compareTo(a2.getDateOfOpening());
	}

}
