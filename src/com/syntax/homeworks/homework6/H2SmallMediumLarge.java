package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H2SmallMediumLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int number = scanner.nextInt();

        String size = "";
        if (number >= 1 && number <= 10) {
            size = "Small";
        } else if (number >= 11 && number <= 100) {
            size = "Medium";
        } else if (number >= 101 && number <= 1000) {
            size = "Large";
        } else {
            size = "Invalid Size";
        }
        System.out.println(size);
    }
}
