package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H6LanguageGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your country : ");
        String country = scanner.next().toLowerCase();

        String language = "";
        if (country.equals("america")) {
            language = "English";
        } else if (country.equals("nepal")) {
            language = "Nepali";
        } else if (country.equals("spain")) {
            language = "spanish";
        } else if (country.equals("german")) {
            language = "spanish";
        } else {
            language = "Wrong input of country, can't find language";
        }
        System.out.println("User speaks the " + language + " language.");
    }
}
