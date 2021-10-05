package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int val, sum = 0;
//
//        Scanner scan = new Scanner(System.in);
//
//        String line;
//
//        System.out.println("Enter a line of text");
//
//        Scanner scanLine = new Scanner(scan.nextLine());
//
//        while (scanLine.hasNext()) {
//            try {
//                val = Integer.parseInt(scanLine.next());
//                sum += val;
//            } catch (Exception e) {
////                System.out.println("Exception: " + e);
//            }
//        }
//
//        System.out.println("The sum of the integers on this line is " + sum);

        Passport correctPassport = new Passport(
                "Kamal Sultan",
                "AF123456",
                "09/10/2010",
                "10/11/2025"
        );

        Passport incorrectPassport = new Passport(
                "Kamal Sultan",
                "0F12B456",
                "09/10/2010",
                "10/11/1905"
        );

        Passport incorrectDates = new Passport(
                "Kamal Sultan",
                "AF123456",
                "09/10/2010",
                "10/11/2005"
        );

        Passport incorrectPassportNumberLetters = new Passport(
                "Kamal Sultan",
                "A2123456",
                "09/10/2010",
                "10/11/2025"
        );

        Passport incorrectPassportNumberDigits = new Passport(
                "Kamal Sultan",
                "AF12B56D",
                "09/10/2010",
                "10/11/2025"
        );

        Passport incorrectNumberLength = new Passport(
                "Kamal Sultan",
                "AF123456000",
                "09/10/2010",
                "10/11/2025"
        );

        correctPassport.show("correctPassport");
        incorrectPassport.show("incorrectPassport");
        incorrectDates.show("incorrectDates");
        incorrectPassportNumberLetters.show("incorrectPassportNumberLetters");
        incorrectPassportNumberDigits.show("incorrectPassportNumberDigits");
        incorrectNumberLength.show("incorrectNumberLength");
    }
}