package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int val, sum = 0;

        Scanner scan = new Scanner(System.in);

        String line;

        System.out.println("Enter a line of text");

        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (Exception e) {
//                System.out.println("Exception: " + e);
            }
        }

//        try {
//            while (scanLine.hasNext()) {
//                val = Integer.parseInt(scanLine.next());
//                sum += val;
//            }
//        } catch (Exception e) {
//        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}