package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H5GradeDetermination {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the score : ");
        int score = userInput.nextInt();

        char grade = ' ';
        if(score >= 90){
           grade = 'A';
        }else if(score >= 70 && score < 90){
            grade = 'B';
        }else if(score >= 50 && score < 70){
            grade = 'C';
        }else if(score < 50){
            grade = 'F';
        }
        System.out.println(grade);
    }
}
