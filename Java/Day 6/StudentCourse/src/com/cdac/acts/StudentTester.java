package com.cdac.acts;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
public class StudentTester {
	
	private String name;
	private CourseEnum course;
	private Date dob;
	
	
	public StudentTester() {
		this.name = "";
		this.course = null;
		this.dob = null;
	}
	
	public StudentTester(String name,  CourseEnum course, Date dob) {
		this.name = name;
		this.course = course;
		this.dob = dob;
	}
	

	public String tostring() {
		return "Name =" +name + "\tCourses =" +course.getCourses() + "\t DOB =" +DateUtil.getFormattedDate(dob);
	}
	
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number no student want to add");
		int n = sc.nextInt();
		StudentTester[] arr = new StudentTester[n];
		sc.nextLine();
		Date date = new Date();
		
		String name="";
		CourseEnum course=null;
		Date dob = null;
		
		for(int i = 0; i<arr.length; i++) {
		
			System.out.println("Enter Name");
			name = sc.nextLine();
			System.out.println("Enter Course from (DAC, DBDA, DAI");
			String coursestr = sc.nextLine();
			course = CourseEnum.valueOf(coursestr);
			System.out.println("Enter DOB");
			String strDate = sc.nextLine();
			dob = DateUtil.getDate(strDate);
			
			StudentTester obj = new StudentTester(name, course, dob);
			
			arr[i] = obj;

		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i].dob.after(arr[j].dob)) {
					StudentTester temp = arr[i];
					arr[i] =  arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].tostring());
		}
				
	}

}
