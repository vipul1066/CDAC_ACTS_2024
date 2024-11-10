package com.cdac.acts;

import java.time.LocalDate;

public class Printer {
	private String serialNo;
	private String modelNo;
	private Integer price;
	private PrinterType printerType;
	private LocalDate manufacturingData;
	
	public Printer(String serialNo, String modelNo, Integer price, PrinterType printerType,
			LocalDate manufacturingData) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.printerType = printerType;
		this.manufacturingData = manufacturingData;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public PrinterType getPrinterType() {
		return printerType;
	}
	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}
	public LocalDate getManufacturingData() {
		return manufacturingData;
	}
	public void setManufacturingData(LocalDate manufacturingData) {
		this.manufacturingData = manufacturingData;
	}
	
	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", printerType="
				+ printerType + ", manufacturingData=" + manufacturingData + "]";
	}
	
	
	
	
	

}
