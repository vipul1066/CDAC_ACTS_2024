package com.cdac.acts;
import java.util.Scanner;

public class MobileNumber {

    public static String formatMobileNumber(String mobile) {
        mobile = mobile.replaceAll("[^0-9]", "");
        
        if (mobile.length() < 10) {
            return "Mobile number must be at least 10 digits";
        } else if (mobile.length() > 10) {
            mobile = mobile.substring(mobile.length() - 10, mobile.length());
        }

        return "+91-"+ mobile.substring(0,3)+"-"+ mobile.substring(3, 6)+"-" + mobile.substring(6);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter mobile number");
        String input = scanner.nextLine();
        
        String formattedNumber = formatMobileNumber(input);
        System.out.println(formattedNumber);
    }
}
