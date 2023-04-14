package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class IfElseCalCulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number : ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /) ");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println(number1 + number2);
        } else if (operator.equals("-")) {
            System.out.println(number1 - number2);
        } else if (operator.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operator.equals("/")) {
            System.out.println(number1 / number2);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
