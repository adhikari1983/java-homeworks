/*Create a Java program and declare int variable that will hold a month.
Based on the value of the variable your program should print the name of the month.
Write a program to check whether number is positive or negative.
Write a Java Program to check whether number is Even or Odd.*/
package com.syntax.homeworks.homework2;

public class NumberChecking {
    public static void main(String[] args) {
        int numberOfTheMonth = 6;
        if(numberOfTheMonth == 6){
            System.out.println("Name of the month is June.");
        }

        int numberToCheckPositiveOrNegative = 5;
        if(numberToCheckPositiveOrNegative < 0){
            System.out.println("Checked number is Negative. ");
        }
        else{
            System.out.println("Checked number is Positive. ");
        }

        int numberToCheckEvenOrOdd = 15;
        if(numberToCheckEvenOrOdd % 2 == 0){
            System.out.println("Checked number is Even.");
        }
        else{
            System.out.println("Checked number is Odd.");
        }
    }
}
