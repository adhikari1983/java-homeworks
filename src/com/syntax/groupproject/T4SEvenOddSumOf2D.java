/*
  Create a 2D array of integers. Develop a program which will calculate the sum of even and odd
  numbers for that array.
 */
package com.syntax.groupproject;

public class T4SEvenOddSumOf2D {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int evenSum = 0, oddSum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
        }
        System.out.println("The sum of even numbers of the array is : " + evenSum);
        System.out.println("The sum of odd numbers of the array is : " + oddSum);
    }
}
