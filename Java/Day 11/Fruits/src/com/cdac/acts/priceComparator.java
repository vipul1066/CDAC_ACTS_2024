package com.cdac.acts;

import java.util.Comparator;

public class priceComparator implements Comparator<Fruits> {
	public int compare(Fruits f1, Fruits f2) {
		//return f1.getPrice().compareTo(f2.getPrice());
		return Integer.compare(f1.getPrice(), f2.getPrice());
	}

}
