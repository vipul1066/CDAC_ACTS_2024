package com.cdac.acts;
import java.util.*;

public class Student {
	private int rno;
	private String name;
	private int marks;
	
	Student(){
		this.rno=0;
		this.name="";
		this.marks=0;
	}
	Student(int rno, String name,int marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	public static void sortRoll(Student sarr[], int count) {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(sarr[i].rno > sarr[j].rno) {
					Student temp = sarr[i];
					sarr[i]=sarr[j];
					sarr[j]=temp;
				}
			}
		}
	}
	public static void sortMarks(Student sarr[], int count) {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(sarr[i].marks > sarr[j].marks) {
					Student temp = sarr[i];
					sarr[i]=sarr[j];
					sarr[j]=temp;
				}
			}
		}
	}
	public void Display() {
		System.out.println("Student name is: "+name+ " Roll no: "+ rno+ " Marks: "+ marks);
	}

	public static void main(String[] args) {
		Student[] sarr = new Student[40];
		Scanner sc= new Scanner(System.in);
		int count=0;
		int n;
		do {
			System.out.println("1. Add Student");
			System.out.println("2. Print Student by Roll No.");
			System.out.println("3. Print All Student Sorted by Marks");
			System.out.println("0. exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter your name:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter your Roll no:");
				int rno= sc.nextInt();
				System.out.println("Enter your marks:");
				int marks = sc.nextInt();
				Student student = new Student(rno, name, marks);
				sarr[count]= student;
				count++;
				} break;
			case 2:{
				System.out.println("Print Student Data by Roll No:");
				sortRoll(sarr,count);
				for (int i = 0; i < count; i++) {
                    sarr[i].Display();
                }	
			} break;
			case 3:{
				System.out.println("Print All students Sorted by Marks:");
				sortMarks(sarr,count);
				for (int i = 0; i < count; i++) {
                    sarr[i].Display();
                }
			}break;
			case 0:{
				System.out.println("You Exited");
			}break;
			default:{
				System.out.println("You entered wrong choice");
			}
			}
		}
			while(n!=0);	
		sc.close();

	}

}
