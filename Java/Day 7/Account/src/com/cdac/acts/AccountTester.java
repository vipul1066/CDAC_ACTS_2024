package com.cdac.acts;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		int choice = 0;
		
		System.out.println("Enter Account Holder Name");
		String accName = sc.nextLine();
		System.out.println("Enter Account date of opening in dd/MM/yyyy format ");
		String str = sc.nextLine();
		Date date1 = DateUtils.getDate(str);
		
		System.out.println("****Menu****");
		System.out.println("1. For Saving Account");
		System.out.println("2. For Current Account");
		System.out.println("3. For Deposit Account");
		System.out.println("Enter choice");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:{
			System.out.println("Enter amount ");
			double amount = sc.nextDouble();
			account = new SavingAccount(accName,date1, amount);
			System.out.println(account.toString());
		}break;
		
		case 2:{
			System.out.println("Enter amount ");
			double amount = sc.nextDouble();
			account = new CurrentAccount(accName, date1, amount );
			System.out.println(account.toString());
		}break;
		
		case 3:{
			System.out.println("Enter amount ");
			double amount = sc.nextDouble();
			account = new DepositAccount(accName, date1, amount );
			System.out.println(account.toString());
		}break;
		
		default:{
			System.out.println("Invalid choice");
		}
			
		
	}

}
}
