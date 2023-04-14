package com.syntax.replits.replit4.arrays;

import java.util.Scanner;

public class E78Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number*10);
        }
    }
}
