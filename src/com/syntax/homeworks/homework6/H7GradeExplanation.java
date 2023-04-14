package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H7GradeExplanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade  A/B/C/D....  ");
        char grade = scanner.next().charAt(0);

        String explanation = "";
        switch(grade){
            case 'A':
            explanation = "Excellent";
            break;
            case 'B':
            explanation = "Good";
            break;
            case 'C':
            explanation = "Average";
            break;
            case 'D':
            explanation = "Bad";
            break;
            default:
            explanation = "Not Acceptable.";
            break;
        }
        System.out.println("User entered the grade " + grade + " which is " + explanation + " .");
    }
}
