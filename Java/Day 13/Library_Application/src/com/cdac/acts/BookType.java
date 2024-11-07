package com.cdac.acts;

public enum BookType {
	fantacy("fantacy"),
	mystery("mystery"),
	novel("novel"),
	adventure("adventure"),
	thriller("thriller"),
	history("history"),
	horror("horror");
	
	private String str;
	private BookType(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return str;
	}
}
