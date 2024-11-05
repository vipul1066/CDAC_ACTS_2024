package com.cdac.acts;
import java.util.Comparator;

public class quantityComparator implements Comparator<Fruits> {
	public int compare(Fruits f1, Fruits f2) {
		//return f1.getQuality().compareTo(f2.getQuality());
		return Integer.compare(f1.getQuality(), f2.getQuality());
	}

}
