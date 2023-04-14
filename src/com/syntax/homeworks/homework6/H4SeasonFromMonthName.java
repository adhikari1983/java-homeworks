package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H4SeasonFromMonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month : ");
        String birthMonth = scanner.next();

        String season = "";
        if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {
            season = "You were born in Spring season";
        } else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
            season = "You were born in Summer season";
        } else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
            season = "You were born in Fall or Autumn season";
        } else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
            season = "You were born in Winter season";
        } else {
            season = "Invalid Input.";
        }
        System.out.println(season);
    }
}
