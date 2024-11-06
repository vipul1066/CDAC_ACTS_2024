package com.cdac.acts;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args) {
	List<Account> linkedlist = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	
	int n;
	do {
		System.out.println("****Menu*****");
		System.out.println("1. Add Account");
		System.out.println("2. Display all Accounts");
		System.out.println("3. Get Account details");
		System.out.println("4. fund transfer");
		System.out.println("5. Remove Account");
		System.out.println("6. Apply Interest");
		System.out.println("7. Sort accounts per ascending A/C Number");
		System.out.println("8. Sort by Account Opening Date");
		System.out.print("Enter your choice: ");
		n = sc.nextInt();
		switch(n) {
		case 1: {
			System.out.println("Enter your name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter your Account opening date in YYYY-MM-DD format");
			String str = sc.nextLine();
			LocalDate date = ValidationUtils.ValidateDateOfOpening(str);
			Double balance=0.0;
			try {
			System.out.println("Enter the balance");
			balance = sc.nextDouble();
			if(balance <1000) {
				throw new MinBalanceException("AMOUNT SHOULD BE GREATER THAN 1000");
			}
			Account account = new Account(name, date, balance );
			linkedlist.add(account);
			} catch(MinBalanceException e) {
				System.out.println(e.getMessage());
			}

		} break;
		case 2:{
			System.out.println("All Account details as below");
			for(Account account : linkedlist) {
				System.out.println(account);

			}

		} break;
		
		case 3:{
			System.out.println("Enter account number");
			Integer accNumber = sc.nextInt();
			Boolean found= false;
			try {
				for(Account account : linkedlist) {
					if(accNumber.equals(account.getAccNo())) {
						found = true;
						System.out.println(account);
					}
				}
				if(!found) {
					throw new AccountNotFoundException ("ACCOUNT NOT FOUND !! PLEASE ENTER CORRECT ACCOUNT NUMBER");
				}
			}
			catch (AccountNotFoundException e){
				System.out.println(e.getMessage());
			}
		} break;
		case 4: {
			try {
			System.out.println("Enter Account number to transfer fund (Sender Account) ");
			Integer accSender = sc.nextInt();
			System.out.println("Enter amount to transfer");
			Integer amount = sc.nextInt();
			boolean senderFound = false;
			
			for(Account account : linkedlist) {
				if(accSender.equals(account.getAccNo())) {
					senderFound = true;
					if(account.getBalance() < amount) {
						throw new MinBalanceException("AMOUNT SHOULD BE LESS THAN OR EQUAL TO BANK BALANCE");
					}
					else {
						Double balance =account.getBalance();
						balance -= amount;
						if(balance < 1000) { 
							throw new MinBalanceException("Balance Should be greater than 1000");
						}
						account.setBalance(balance);
					}
				
					}
				}
				
			if(!senderFound) {
				throw new AccountNotFoundException ("ACCOUNT NOT FOUND !! PLEASE ENTER CORRECT ACCOUNT NUMBER");
			}
			System.out.println("Enter Account number to Accept (receiver Account) ");
			Integer accReceiver = sc.nextInt();
			boolean receiverFound = false;

			for(Account account2 : linkedlist) {
				if (accReceiver.equals(account2.getAccNo())) {
			        receiverFound = true;
			        Double balance = account2.getBalance();
			        balance += amount;
			        account2.setBalance(balance);
			        System.out.println("Funds transferred successfully!");
			        break; 
			    }
			}	
			if (!receiverFound) {
				throw new AccountNotFoundException ("ACCOUNT NOT FOUND !! PLEASE ENTER CORRECT ACCOUNT NUMBER");
			}
		}
			catch (AccountNotFoundException e){
				System.out.println(e.getMessage());
			}
			catch (MinBalanceException e) {
				System.out.println(e);
				}
		} break;
		case 5: {
			try {
		    System.out.println("Enter Account Number to remove Account");
		    Integer removeAccount = sc.nextInt();
		    boolean accountFound = false;
		    
		    Iterator<Account> iterator = linkedlist.iterator();
		    while (iterator.hasNext()) {
		        Account account = iterator.next();
		        if (removeAccount.equals(account.getAccNo())) {
		            accountFound = true;
					Account removeAcc = account;
					linkedlist.remove(iterator);
		            iterator.remove(); 
		            System.out.println("Account removed successfully");
		            break;
		        }
		    }

		    if (!accountFound) {
		    	throw new AccountNotFoundException ("ACCOUNT NOT FOUND !! PLEASE ENTER CORRECT ACCOUNT NUMBER");
		    }
			}
			catch (AccountNotFoundException e){
				System.out.println(e.getMessage());
			}
		} break;

		
		case 6:{
			System.out.println("Interest on all accounts are as below");
			for(Account account : linkedlist) {
				Double Interest = account.getBalance() * 0.04;
				Interest += account.getBalance();
				account.setBalance(Interest);
				System.out.println(account);
			}
		}break;
		case 7: {
			System.out.println("Account in ascending order per Account number");
			Collections.sort(linkedlist, new AccNoComparator());
			for(Account account : linkedlist) {
				System.out.println(account);
			}
		} break;
		case 8: {
			System.out.println("Account sorted as per Date of opening");
			Collections.sort(linkedlist, new DateOpeningComparator());
			for(Account account : linkedlist) {
				System.out.println(account);
			}
		} break;
		case 0 :{
			System.out.println("You exited..");
		}break;
		default:{
			System.out.println("You entered wrong choice");
		}
		
		
		}}while(n!=0);
	}
}
