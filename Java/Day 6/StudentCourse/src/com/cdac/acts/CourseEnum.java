package com.cdac.acts;

public enum CourseEnum {
	
	DAC("Diploma in Advance Computing"),
	DBDA("Diploma in Big Data"),
	DAI("Diploma in Artificial Intelligence");
	
	
	private String courses;
	
	private CourseEnum(String courses) {
		this.courses = courses;
	}
	
	public String getCourses() {
		return courses;
	}	

}
