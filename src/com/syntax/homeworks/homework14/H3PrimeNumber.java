/*
    Write a method to return whether given number is prime or not?
 */
package com.syntax.homeworks.homework14;

import java.util.Scanner;

public class H3PrimeNumber {

    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scan.nextInt();

        H3PrimeNumber obj = new H3PrimeNumber();
        boolean result = obj.isPrime(number);
        System.out.println("Is given number prime ?  \n" + result);
    }
}
