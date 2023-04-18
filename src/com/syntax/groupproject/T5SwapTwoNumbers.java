/*
 Write a program to swap 2 numbers without a temporary variable?
 */
package com.syntax.groupproject;

public class T5SwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Numbers before swapping : " + "num1 = " + num1 + " and " + "num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nNumbers before swapping : " + "num1 = " + num1 + " and " + "num2 = " + num2);
    }
}
