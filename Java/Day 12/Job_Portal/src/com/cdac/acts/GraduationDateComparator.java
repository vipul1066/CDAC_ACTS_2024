package com.cdac.acts;

import java.util.Comparator;

public class GraduationDateComparator implements Comparator<JobSeeker> {
	
	public int compare(JobSeeker JS1, JobSeeker JS2) {
		return JS1.getGraduationDate().compareTo(JS2.getGraduationDate());
	}

}
