package com.cdac.acts;
import com.cdac.acts.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
		private String aadharno;
		private String name;
		private Date dob;
		private Address addr;
		
		public Person() {
			super();
		}
		public Person(String aadharno, String name, Date dob, Address addr) {
			super();
			this.aadharno = aadharno;
			this.name = name;
			this.dob = dob;
			this.addr = addr;
		}
		
		
		@Override
		public String toString() {
			return "Person [aadharno=" + aadharno + ", name=" + name + ", dob=" + dob + ", addr=" + addr + "]";
		}
		
		public static void main(String[] args) throws ParseException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of person");
			String name = sc.nextLine();
			System.out.println("Enter Aadhar card no. of person");
			String aadharno = sc.nextLine();
			System.out.println("Enter DOB in DD/MM/YYYY format");
			String str = sc.nextLine();
			Date dob = DateFormat.getDate(str);
			
			System.out.println("Enter Address");
			System.out.println("line 1");
			String line1 = sc.nextLine();
			System.out.println("line 2");
			String line2 = sc.nextLine();
			System.out.println("pin");
			String pin = sc.nextLine();
			Address addr = new Address(line1, line2, pin);
			
			Person person = new Person(aadharno,name,dob,addr);
			System.out.println(person);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 Date independenceDay = sdf.parse("15/08/1947");
		        if (dob.before(independenceDay)) {
		            System.out.println("The person was born before 15th August 1947.");
		        } else {
		            System.out.println("The person was born after 15th August 1947.");
		        }
			
		}
}
