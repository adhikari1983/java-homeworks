/*
   Write a java program to check whether a given number is prime or not?
*/
package com.syntax.groupproject;

import java.util.Scanner;

public class T6PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(number + " is a Prime number. ");
        } else {
            System.out.println(number + " is not a Prime number. ");
        }
    }
}
