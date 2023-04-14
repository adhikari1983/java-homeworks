/*
   Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
   Print the sum of all numbers.
 */
package com.syntax.homeworks.homework10.array2d;

public class H4Array2D {
    public static void main(String[] args) {
        int[][] integer = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int[] ints : integer) {
            for (int intNum : ints) {
                sum = intNum + sum;
            }
        }
        System.out.println("The sum of all numbers is : " + sum);
    }
}
