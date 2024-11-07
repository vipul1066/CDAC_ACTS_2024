package com.cdac.acts;

import java.time.LocalDate;

public class ValidationUtils {
	public static BookType getValidBookType (String booktype) {
		BookType booktypeEnum = null;
		try {
			booktypeEnum = BookType.valueOf(booktype);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		return booktypeEnum;
	}
	
	public static LocalDate validatePublishedDate(String strDate) {
		LocalDate date = LocalDate.parse(strDate);
		
		LocalDate today = LocalDate.now();
		if(date.isBefore(today)) {
			return date;
		}
		return null;
	}

}
