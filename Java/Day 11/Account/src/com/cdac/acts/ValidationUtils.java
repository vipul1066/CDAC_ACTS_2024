package com.cdac.acts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidationUtils {
	public static LocalDate ValidateDateOfOpening(String strDob) {
		LocalDate date = LocalDate.parse(strDob);
		
		LocalDate today = LocalDate.now();
		
		if(date.isBefore(today)) {
			return date;
		}
		return null;
	}

}