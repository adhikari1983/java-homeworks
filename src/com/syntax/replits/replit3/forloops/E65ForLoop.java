/*
Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
 */
package com.syntax.replits.replit3.forloops;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = scanner.nextInt();

        for (int i = x-1; i >=0; i--) {
            System.out.print(i + " ");
        }
    }
}
