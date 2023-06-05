/*
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
 */
package com.syntax.homeworks.homework28;

import java.util.Scanner;

public class HW1 {

    static void checkAgeEligibility(int age)  {
        try {
         if(age<16){
             throw new RuntimeException();
         }else{
             System.out.println("Eligible age to do .....");
         }
        } catch (RuntimeException e) {
           // System.out.println("Exception occurred " + age + " is not eligible age to do .....");
          e.printStackTrace();
            //System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int checkAge = scanner.nextInt();

       checkAgeEligibility(checkAge);
    }
}
