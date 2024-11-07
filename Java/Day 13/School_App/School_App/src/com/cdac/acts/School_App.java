package com.cdac.acts;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class School_App {
	public static void main(String[] args) {
		
		Map<StudentKey, Student> schoolApp = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Using HashMap");
			System.out.println("1. Add Student");
			System.out.println("2. Find Student");
			System.out.println("3. Display all Students");
			System.out.println("0. For exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			
			switch (n) {
			case 1: {
				sc.nextLine();
				System.out.println("Enter Student name");
				String name = sc.nextLine();
				System.out.println("Enter Date of Birth");
				String strDOB = sc.nextLine();
				
				System.out.println("Enter your Standard");
				String std = sc.nextLine();
				System.out.println("Enter your Division");
				String div = sc.nextLine();
				System.out.println("Enter your Roll Number");
				Integer rollNo = sc.nextInt();
				
				LocalDate validDate = ValidateUtil.ValidateDOB(strDOB);
				if(validDate != null) {
				Student s1 = new Student(std,div, rollNo, name, validDate);
				schoolApp.put(s1.getKey(), s1);
				}else {
                    System.out.println("Invalid Date of Birth entered.");
                }

				
				
			} break;
			case 2:{
				System.out.println("Enter your Standard");
				sc.nextLine();
				String std = sc.nextLine();
				System.out.println("Enter your Division");
				String div = sc.nextLine();
				System.out.println("Enter your Roll Number");
				Integer rollNo = sc.nextInt();
				sc.nextLine();
				StudentKey key = new StudentKey(std, div, rollNo);
				
                Student foundStudent = schoolApp.get(key);

                if (foundStudent != null) {
                    System.out.println("Student found: " + foundStudent);
                } else {
                    System.out.println("Student not found.");
                }
				
			}break;
			case 3:{
				// System.out.println("All Student Data as follows");
				// Set<Map.Entry<StudentKey,Student>> entries = schoolApp.entrySet();
				// for(Map.Entry<StudentKey, Student> entry : entries) {
				// 	System.out.println(entry.getValue());
				// }
				schoolApp.values().forEach(System.out::println);
				
			}break;
			case 0:{
				System.out.println("You exited..");
				
			} break;
			default:{
				System.out.println("You entered wrong option");
			}
			
			
		}}while(n!=0);
		
	}

}
