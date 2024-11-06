package com.cdac.acts;

import java.time.LocalDate;

public class JobSeeker implements Comparable<JobSeeker> {
	private Double registrationId;
	private String name;
	private String email;
	private String password;
	private LocalDate dateOfBirth;
	private Double AadharId;
	private String phoneNumer;
	private LocalDate graduationDate;
	private Degree degree;
	
	
	
	public JobSeeker(Double registrationId, String name, String email, String password, LocalDate dateOfBirth,
			Double aadharId, String phoneNumer, LocalDate graduationDate, Degree degree) {
		super();
		this.registrationId = registrationId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		AadharId = aadharId;
		this.phoneNumer = phoneNumer;
		this.graduationDate = graduationDate;
		this.degree = degree;
	}
	
	public Double getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Double registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Double getAadharId() {
		return AadharId;
	}
	public void setAadharId(Double aadharId) {
		AadharId = aadharId;
	}
	public String getPhoneNumer() {
		return phoneNumer;
	}
	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	public LocalDate getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "JobSeeker [registrationId=" + registrationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", dateOfBirth=" + dateOfBirth + ", AadharId=" + AadharId + ", phoneNumer=" + phoneNumer
				+ ", graduationDate=" + graduationDate + ", degree=" + degree + "]";
	}
	
	public int compareTo(JobSeeker o) {
		return this.email.compareTo(o.email);
	}
	
	

}
