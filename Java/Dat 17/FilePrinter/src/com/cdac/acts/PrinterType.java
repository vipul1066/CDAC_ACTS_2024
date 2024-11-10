package com.cdac.acts;

public enum PrinterType {
	LASER,
	INLJET,
	DOTMATRIX;
	
	private String str;
	
	public void setPrinterType(String str) {
		this.str=str;
	}
	public String getPrinterType() {
		return str;
	}

}
