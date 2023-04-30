/*
    Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
    score > 90 - A
    score > 80 - B
    score > 70 - C
    score > 50 - D
    anything else - F
 */
package com.syntax.homeworks.homework14;

import java.util.Scanner;

public class H4StudentGrade {

    char getGrade(int score) {
        char grade = ' ';
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check the grade : ");
        int numberToCheck = scan.nextInt();

        H4StudentGrade obj = new H4StudentGrade();
        char studentGrade = obj.getGrade(numberToCheck);
        System.out.println("StudentGrade is :  " + studentGrade);

    }
}
