package com.cdac.acts;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DataUtil {
	public static JobSeeker getData(Scanner sc){
		
	
		System.out.println("Enter Your Registration ID");
		Double registrationId = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your Email address");
		String email = sc.nextLine();
		System.out.println("Enter your Password");
		String password = sc.nextLine();
		System.out.println("Enter Date of Birth(DOB) in YYYY-MM-DD format");
		String dob = sc.nextLine();
		System.out.println("Enter Addhar Card Number");
		Double AadharId = sc.nextDouble();
		System.out.println("Enter your Phone Number(10 digit)");
		sc.nextLine();
		String phoneNumber = sc.nextLine();
		
		Boolean isValidMobile = ValidationUtil.validMobile(phoneNumber);
		if(!isValidMobile) {
			System.out.println("Incorrect Mobile Number");
			return null;
		}
		
		System.out.println("Enter Graduation Date in YYYY-MM-DD format");
		String date = sc.nextLine();
		System.out.println("Enter your Degree name(CS,ME,CE,EE)");
		String degree = sc.nextLine();
		
		LocalDate validDOB = ValidationUtil.ValidateDOB(dob);
		LocalDate validGraduationDate = ValidationUtil.ValidateGaduationDate(date);
		Degree validDegree = ValidationUtil.getValidCourse(degree);
		
		if(validDOB != null && validGraduationDate != null && validDegree != null) {
			JobSeeker JS = new JobSeeker(registrationId,name, email,password, validDOB, AadharId, phoneNumber, validGraduationDate, validDegree);
			return JS;
		}
		else {
			System.out.println("Invalid data entered");
			return null;
		}
		
	}

}
