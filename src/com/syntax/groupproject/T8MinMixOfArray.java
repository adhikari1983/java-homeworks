/*
   Maximum and minimum number in the array?
 */
package com.syntax.groupproject;

public class T8MinMixOfArray {
    public static void main(String[] args) {
        int[] numbers = {34, 30, 27, 55, 25, 31, 24, 32, 10};

        int maxNumber = numbers[0], minNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("Maximum number is : " + maxNumber);
        System.out.println("Minimum number is : " + minNumber);
    }
}
