package com.cdac.acts;
import java.util.*;

public class Employee {
	private int empId;
	private String name;
	private int salary;
	
	Employee(){
		this.empId=0;
		this.name="";
		this.salary=0;
	}
	Employee(int empId, String name,int salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public static void sortEmpId(Employee earr[], int count) {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(earr[i].empId > earr[j].empId) {
					Employee temp = earr[i];
					earr[i]=earr[j];
					earr[j]=temp;
				}
			}
		}
	}
	public static void sortSalary(Employee earr[], int count) {
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(earr[i].salary > earr[j].salary) {
					Employee temp = earr[i];
					earr[i]=earr[j];
					earr[j]=temp;
				}
			}
		}
	}
	public void Display() {
		System.out.println("Employee name is: "+name+ " Employee id: "+ empId+ " Salary: "+ salary);
	}

	public static void main(String[] args) {
		Employee[] earr = new Employee[40];
		Scanner sc= new Scanner(System.in);
		int count=0;
		int n;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Print Student by EmpID");
			System.out.println("3. Print All Employees Sorted by salary");
			System.out.println("0. exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Enter your name:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter your Employee Id:");
				int empId= sc.nextInt();
				System.out.println("Enter your Salary:");
				int salary = sc.nextInt();
				Employee employee = new Employee(empId, name, salary);
				earr[count]= employee;
				count++;
				} break;
			case 2:{
				System.out.println("Print Employee Data by Employee ID:");
				sortEmpId(earr,count);
				for (int i = 0; i < count; i++) {
                    earr[i].Display();
                }	
			} break;
			case 3:{
				System.out.println("Print All Employee Sorted by Marks:");
				sortSalary(earr,count);
				for (int i = 0; i < count; i++) {
                    earr[i].Display();
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
