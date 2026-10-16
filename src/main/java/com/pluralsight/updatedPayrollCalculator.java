package com.pluralsight;

import java.util.*;
public class updatedPayrollCalculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter the amount of hours worked: ");
        float hoursWorked = myScanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float payRate = myScanner.nextFloat();
        payrollCalculator(name, hoursWorked, payRate);
    }
    public static void payrollCalculator (String name, float hoursWorked, float payRate) {
        System.out.println("Employee: " + name);
        System.out.println("Gross pay = " + (payRate * hoursWorked));
    }
}