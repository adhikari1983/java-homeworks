/*
    Write a program that reads two people's first names and if they're expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY

    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL
 */
package com.syntax.homeworks.homework12;

import java.util.Scanner;

public class H3StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom’s first name? ");
        String nameOfMom = scan.nextLine();
        System.out.println("Dad’s first name? ");
        String nameOfDad = scan.nextLine();
        System.out.println("Boy or Girl? ");
        String genderOfChild = scan.nextLine();

        String nameOfChild = " ";
        if (genderOfChild.equalsIgnoreCase("boy")) {
            nameOfChild = (nameOfDad.substring(0, 3) + nameOfMom.substring(2, 4)).toUpperCase();
            System.out.println("Suggested baby name: " + nameOfChild);
        } else if (genderOfChild.equalsIgnoreCase("girl")) {
            nameOfChild = (nameOfMom.substring(0, 2) + nameOfDad.substring(3, 6)).toUpperCase();
            System.out.println("Suggested baby name: " + nameOfChild);
        } else {
            System.out.println("Please enter either BOY or GIRL only.");
        }
    }
}
