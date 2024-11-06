package com.cdac.acts;

import java.time.LocalDate;
import java.util.List;

public class ValidationUtil {
	
	public static Degree getValidCourse(String course) {
		Degree courseEnum = null;
		try {
			courseEnum = Degree.valueOf(course);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return courseEnum;
	}
	
	public static LocalDate ValidateDOB(String str) {
		LocalDate date = LocalDate.parse(str);
		LocalDate today = LocalDate.now();
		
		if(date.isBefore(today)) {
			return date;
		}
		return null;
		
	}
	
	public static LocalDate ValidateGaduationDate(String str) {
		LocalDate date = LocalDate.parse(str);
		LocalDate today = LocalDate.now();
		
		if(date.isBefore(today)) {
			return date;
		}
		return null;	
	}
	public static Boolean Duplicate(JobSeeker js, List<JobSeeker> jobBoard) {
		for(JobSeeker jobseeker : jobBoard) {
			if(jobseeker.getRegistrationId().equals(js.getRegistrationId())
					&& jobseeker.getName().equals(js.getName())
					&& jobseeker.getEmail().equals(js.getEmail())
					&& jobseeker.getPassword().equals(js.getPassword())
					&& jobseeker.getDateOfBirth().equals(js.getDateOfBirth())
					&& jobseeker.getAadharId().equals(js.getAadharId())
					&& jobseeker.getPhoneNumer().equals(js.getPhoneNumer())
					&& jobseeker.getGraduationDate().equals(js.getGraduationDate())
					&& jobseeker.getDegree().equals(js.getDegree())	) {
				
				return true;
			}
		}
		return false;
	}
	
	public static Boolean validMobile(String mobile) {
		int length = mobile.length();
		if(length == 10) {
			return true;
		}
		else {
			return false;
		}
	}

}
