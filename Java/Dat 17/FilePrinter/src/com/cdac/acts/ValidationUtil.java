package com.cdac.acts;

import java.time.LocalDate;

public class ValidationUtil {
	
	public static PrinterType getPrinterType(String printerType) {
		PrinterType printer = null;
		try {
		printer = PrinterType.valueOf(printerType);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return printer;
	}
	
	public static LocalDate getManufacturingDate(String manufacturingDate) {
		LocalDate mDate = LocalDate.parse(manufacturingDate);
		
		LocalDate today = LocalDate.now();
		if(mDate.isBefore(today)) {
			return mDate;
		}
		return null;
	}

}
