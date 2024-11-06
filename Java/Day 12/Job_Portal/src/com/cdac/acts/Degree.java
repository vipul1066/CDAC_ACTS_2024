package com.cdac.acts;

public enum Degree {
	CS("Computer Science"),
	ME("Mechanical Engineering"),
	CE("Civil Engineering"),
	EE("Electrical Engineering");
	
	private String str;
	private Degree (String str) {
		this.str = str;
	}
	public String getValue() {
		return str;
	}
}
