package com.cdac.acts;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrinterTest implements Serializable{
	public static void main(String[] args) {
		Map<String, Printer> printerMap = new HashMap<>();
		printerMap = SaveFile.LoadData();
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1. Add Printer");
			System.out.println("2. Update Printer Price");
			System.out.println("3. Print all Printer");			
			System.out.println("4. Sorted by Prices");
			System.out.println("5. Filter by Printer Type");
			System.out.println("6.Remove a Printer");
			System.out.println("7. Show Printers by Printer Type");
			System.out.println("8. Save the Information to File");
			System.out.println("0. To Exit");
			System.out.println("Enter your Choice");
			n = sc.nextInt();
			
			switch(n) {
			case 1:{
				System.out.println("Enter Serial Number");
				sc.nextLine();
				String serialNo = sc.nextLine();
				System.out.println("Enter Model Numer");
				String modelNo = sc.nextLine();
				System.out.println("Enter Price");
				Integer price = sc.nextInt();
				System.out.println("Enter Printer Type( LASER, INKJET, DOTMATRIX )");
				sc.nextLine();
				String printerType = sc.nextLine();
				System.out.println("Enter Manufacturing Date in YYYY-MM-DD Format");
				String manufacturingDate = sc.nextLine();
				
				PrinterType validPrinterType = ValidationUtil.getPrinterType(printerType);
				LocalDate validManufacturingDate = ValidationUtil.getManufacturingDate(manufacturingDate);
				if(validPrinterType != null && validManufacturingDate != null) {
					Printer printer = new Printer(serialNo,modelNo,price,validPrinterType,validManufacturingDate);
					printerMap.put(serialNo, printer);
				}
			}break;
			
			case 2:{
				System.out.println("Enter serial Number of Printer");
				sc.nextLine();
				String serial = sc.nextLine();
				if(printerMap.containsKey(serial)) {
					System.out.println("Enter New Price");
					Integer newPrice = sc.nextInt();
					Printer printer = printerMap.get(serial);
					printer.setPrice(newPrice);
					System.out.println("Printer price is Updated Successfully!!");
				}
				else {
					System.out.println("Printer is not present");
				}
				
			}break;
			
			case 3:{
				System.out.println("All Printer Information as follows");
				printerMap.values().forEach(printer -> System.out.println(printer));
				
			}break;
			
			case 4:{
				System.out.println("Printers sorted by price");
				printerMap.values().stream()
							.sorted(Comparator.comparingInt(Printer::getPrice))
							.forEach(System.out::println);
			} break;
			
			case 5:{
				System.out.println("Enter Printer Type to filter (LASER, INKJET, DOTMATRIX):");
			    sc.nextLine(); 
			    String printerType = sc.nextLine();
			    PrinterType validPrinterType = ValidationUtil.getPrinterType(printerType);

			    if (validPrinterType != null) {
			        System.out.println("Printers of type: " + validPrinterType);
			        printerMap.values().stream()
			                .filter(printer -> printer.getPrinterType() == validPrinterType)
			                .forEach(System.out::println);
			    } else {
			        System.out.println("Invalid Printer Type");
			    }
				
			}break;
			
			case 6 :{
				System.out.println("Enter a Serial Number of Printer to remove");
				sc.nextLine();
				String removePrinter = sc.nextLine();
				if(printerMap.containsKey(removePrinter)) {
					printerMap.remove(removePrinter);
					System.out.println("Printer Removed successfully");
				}
				else {
					System.out.println("Printer not Found!!");
				}
			}break;
			case 7:{
				sc.nextLine();
				Map<PrinterType, List<Printer>> groupedPrinters = printerMap.values().stream()
			            .collect(Collectors.groupingBy(Printer::getPrinterType));
			    
			    groupedPrinters.forEach((type, printers) -> {
			        System.out.println("Printers of type " + type + ":");
			        printers.forEach(System.out::println);
			    });
			}break;
	
			case 0:{
				SaveFile.savefile(printerMap);
				System.out.println("File saved successfully and exited");
				
			}break;
			default:{
				System.out.println("You entered wrong choice");
			}
			
			}}while(n!=0);
	}

}
