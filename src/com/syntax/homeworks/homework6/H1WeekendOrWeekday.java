package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H1WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day : ");
        int number = scanner.nextInt();

        String day = "";
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5) {
            day = "It is weekday";
        } else if (number == 6 || number == 7) {
            day = "It is weekend";
        } else {
            day = "Invalid day";
        }
        System.out.println(day);
    }
}
