package com.cdac.acts;

import java.time.LocalDate;

public class Student {
	private StudentKey key;
	private String name;
	private LocalDate dob;
	
	public Student() {
		this.key = new StudentKey("", "", 0);
		this.name ="";
		this.dob = null;
	}
	
	public Student(String std, String div, Integer roll, String name, LocalDate dob) {
		this.key = new StudentKey(std, div, roll);
		this.name = name;
		this.dob = dob;
	}

	public StudentKey getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setKey(StudentKey key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student inFormation = " +"[ name= " + name + ", dob= " + dob + key  + "]";
	}

}
