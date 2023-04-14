/*
Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at 0 and ending at the
x(value must be taken from a user), exclusive.
 */
package com.syntax.replits.replit3.forloops;

import java.util.Scanner;

public class E63Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
                System.out.print(i + " ");
        }
    }
}
