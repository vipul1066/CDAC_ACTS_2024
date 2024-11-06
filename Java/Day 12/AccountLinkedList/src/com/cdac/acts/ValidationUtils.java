package com.cdac.acts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidationUtils {
	public static LocalDate ValidateDateOfOpening(String dateOfOpening) {
		LocalDate dob = null;
        try {
            dob = LocalDate.parse(dateOfOpening);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
            
        }
        return dob;
	}

	
}