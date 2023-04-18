/*
     Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
package com.syntax.groupproject;

public class T7FibonacciNumber {
    public static void main(String[] args) {
        int numbers = 10, firstNum = 0, secondNum = 1, nextNumber = 0;

        System.out.print(firstNum + " " + secondNum);

        for (int i = 2; i < numbers; i++) {
            nextNumber = firstNum + secondNum;
            System.out.print(" " + nextNumber);
            firstNum = secondNum;
            secondNum = nextNumber;
        }
    }
}
