/*
   Write a java program to find the second-largest number in the array?
 */
package com.syntax.groupproject;

public class T9SecondLargestNumOfArray {
    public static void main(String[] args) {
        int[] numbers = {34, 30, 27, 55, 25, 31, 67, 24, 32, 35, 10, 66};

        int largestNum = numbers[0], secondLargestNum = numbers[0];

        for (int number : numbers) {
            if (number > largestNum) {
                largestNum = number;
            }
            if (number != largestNum && number > secondLargestNum) {
                secondLargestNum = number;
            }
        }
        System.out.println("Largest number is : " + largestNum);
        System.out.println("Second largest number is : " + secondLargestNum);
    }
}
