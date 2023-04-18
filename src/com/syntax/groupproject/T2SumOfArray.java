/*
   Create an array of integer values. After the array is created, calculate the sum of
   all stored elements in that array.
 */
package com.syntax.groupproject;

public class T2SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {4, 0, 2, 5, 1, 6, 3};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of all stored numbers is : " + sum);
    }
}
