package com.cdac.acts;

import java.util.Comparator;

public class colorComparator implements Comparator<Fruits> {
	public int compare(Fruits f1, Fruits f2) {
		return f1.getColor().compareTo(f2.getColor());
	}

}
