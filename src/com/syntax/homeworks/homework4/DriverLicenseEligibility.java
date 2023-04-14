
package com.syntax.homeworks.homework4;

import java.util.Scanner;

public class DriverLicenseEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your valid age. ");
        int customerAge = scanner.nextInt();

        if(customerAge >= 18){
            System.out.println("Customer is eligible to issue the driver license. ");
        }else{
            System.out.println("Customer can get a learner's permit.");
        }

    }
}
