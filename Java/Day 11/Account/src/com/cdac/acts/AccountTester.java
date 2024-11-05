package com.cdac.acts;
import com.cdac.acts.Account;
import com.cdac.acts.ValidationUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class AccountTester {
	public static void main(String[] args) {
		List<Account> accountList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("***Menu***");
			System.out.println("1. Add Account");
			System.out.println("2. Print all Account");
			System.out.println("3. Sort all accounts number by descending");
			System.out.println("4. Sort by Account Name");
			System.out.println("5. Sort by Date of opening");
			System.out.println("6. Sort by balance desc");
			System.out.println("0. exit");
			System.out.println("Enter your Choice");
			n = sc.nextInt();
			switch(n) {
			case 1:{
					sc.nextLine();
					System.out.println("Enter your name");
					String accName = sc.nextLine();
					System.out.println("Enter Date of opening in YYYY/MM/DD");
					String dateOfOpening = sc.nextLine();
					LocalDate date = ValidationUtils.ValidateDateOfOpening(dateOfOpening);
					System.out.println("Enter Balance");
					Integer balance = sc.nextInt();
					Account account = new Account(accName,date,balance);
					accountList.add(account);
					System.out.println("Account added successfully");
					
			} break;
			
			case 2:{
				System.out.println("Print all Account");
				for(Account account : accountList) {
					System.out.println(account);
				}	
			}break;
			
			case 3:{
				System.out.println("Sort all Account number by descending order");
				Collections.sort(accountList, new AccountComparator());
				for(Account account : accountList) {
					System.out.println(account);
				}
				
			} break;
			
			case 4:{
				System.out.println("Sort by Account name");
				Collections.sort(accountList, new NameComparator());
				for(Account account : accountList) {
					System.out.println(account);
				}
			} break;
			
			case 5:{
				System.out.println("Sort by Date of opening");
				Collections.sort(accountList, new DateComparator());
				for(Account account : accountList) {
					System.out.println(account);
				}
			} break;
			
			case 6:{
				System.out.println("Sort by balance");
				Collections.sort(accountList, new BalanceComparator());
				for(Account account : accountList) {
					System.out.println(account);
				}
			} break;
			
			case 0:{
				System.out.println("Exiting loop");
			} break;
			
			default: {
				System.out.println("You entered wrong choice");
			}
		}
		}while(n!=0);
		
	}

}
