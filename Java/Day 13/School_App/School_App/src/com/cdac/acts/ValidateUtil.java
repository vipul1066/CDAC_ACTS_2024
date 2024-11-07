package com.cdac.acts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidateUtil {
	private static final DateTimeFormatter Format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public static  LocalDate ValidateDOB (String str) {
		LocalDate date = LocalDate.parse(str, Format);
		LocalDate today = LocalDate.now();
		
		if(date.isBefore(today)) {
			return date;
		}
		return null;
		
	}

}
