package com.cdac.acts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = " ";
	
	public static String getFormattedDate(Date date) {
		if(null == date) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
	
	public static Date getDate(String str) throws ParseException {
		if(null == str || EMPTY.equals(str)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(str);
		return date;
		
		
	}

}

