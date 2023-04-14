/*
You should input:
int end;
Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled
value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space.
 */
package com.syntax.replits.replit3.forloops;

import java.util.Scanner;

public class E64Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int end = scanner.nextInt();

        for (int i = 0; i < end*2; i++) {
                System.out.print(i + " ");
        }
    }
}
