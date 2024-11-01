package com.cdac.acts;

public class Address {
	private String line1;
	private String line2;
	private String pin;
	public Address(String line1, String line2, String pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", pin=" + pin + "]";
	}
	

}
