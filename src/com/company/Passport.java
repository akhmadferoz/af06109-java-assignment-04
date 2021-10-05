package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Passport {
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scan = new Scanner(System.in);

    private String name, passportNumber;
    private Date issueDate, expiryDate;

    private boolean InvalidPassportNumberException, DatesNotVaidException;

    Passport(
            String name,
            String passportNumber,
            String issueDate,
            String expiryDate
    ) {
        this.name = name;
        this.passportNumber = passportNumber;

        String passportChars = passportNumber.substring(0, 2);
        String passportDigits = passportNumber.substring(2);

        if (!passportChars.matches("[A-Za-z]{2}")) {
//            System.out.println(passportChars);
//            System.out.println("InValidPassportNumber");
            this.InvalidPassportNumberException = true;
        }

        if (!passportDigits.matches("[0-9]{6}")) {
//            System.out.println(passportDigits);
//            System.out.println("InValidPassportNumber");
            this.InvalidPassportNumberException = true;
        }

        try {
            this.issueDate = formatDate.parse(issueDate);
            this.expiryDate = formatDate.parse(expiryDate);
        } catch (Exception e) {
            System.out.println("Invalid date format " + e);
        }

        if (this.expiryDate.before(this.issueDate)) {
            this.DatesNotVaidException = true;
        }

    }

    void show(String passport) {
        if (passport != null) {
            System.out.println(passport + " :");
        }

        if (!InvalidPassportNumberException && !DatesNotVaidException) {
            System.out.println("Holder name: " + this.name);
            System.out.println("Passport number: " + this.passportNumber);
            System.out.println("Date of issue: " + this.issueDate);
            System.out.println("Valid till : " + this.expiryDate);
        } else {
            System.out.println("ERROR: Passport details are invalid");
            if (InvalidPassportNumberException) {
                System.out.println("ERROR: Passport number is in the incorrect format.");
            }
            if (DatesNotVaidException) {
                System.out.println("ERROR: Invalid dates. Expiry Date must be after Issue Date.");
            }
        }

        System.out.println("");
    }
}
