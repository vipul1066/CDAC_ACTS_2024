package com.cdac.acts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JobBoard {
	public static void main(String[] args) {
		List<JobSeeker> jobBoard = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1. For New Registration");
			System.out.println("2. Update Email");
			System.out.println("3. Display all by Degree type");
			System.out.println("4. Sort all by Email");
			System.out.println("5. Sort by DOB");
			System.out.println("6. Sort by graduation date");
			System.out.println("0. To Exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
			case 1:{
						Boolean isDuplicate=true;
				  		JobSeeker js = DataUtil.getData(sc);
						if( js != null) {
							isDuplicate = ValidationUtil.Duplicate(js , jobBoard );
							if(!isDuplicate) {
								jobBoard.add(js);
							}
						}
						else {
							System.out.println("An error occured!!");
						}
			} break;
			case 2 : {
				System.out.println("Enter old Email Address");
				String oldEmail = sc.nextLine();
				System.out.println("Enter new Email Address");
				String newEmail = sc.nextLine();
				
				for(JobSeeker jobseeker : jobBoard) {
					if(jobseeker.getEmail().equals(oldEmail)) {
						jobseeker.setEmail(newEmail);
						System.out.println("Email Updated Successfully!!");
						break;
					}
				}
				
			} break;
			case 3: {
				for(JobSeeker jobseeker : jobBoard) {
					System.out.println(jobseeker);
				}
				
			} break;
			 case 4: {
			        System.out.println("Sort by Email");
			        Collections.sort(jobBoard, (j1, j2) -> j1.getEmail().compareTo(j2.getEmail()));
			        for(JobSeeker jobseeker : jobBoard) {
			            System.out.println(jobseeker);
			        }
			    } 
			    break;
			    
			    case 5: {
			        System.out.println("Sort by Date of Birth");
			        Collections.sort(jobBoard, (js1, js2) -> js1.getDateOfBirth().compareTo(js2.getDateOfBirth()));
			        for(JobSeeker jobseeker : jobBoard) {
			            System.out.println(jobseeker);
			        }
			    } 
			    break;
			case 6: {
				System.out.println("Sort by Graduation Date");
				Collections.sort(jobBoard, (s1,s2) -> s1.getGraduationDate().compareTo(s2.getGraduationDate()));
				for(JobSeeker jobseeker : jobBoard) {
					System.out.println(jobseeker);
				}
			} break;
			case 0:{
				System.out.println("You Exited");
			}break;
			default:{
				System.out.println("You entered wrong choice");
			}
		}} while (n!=0);
	}

}
