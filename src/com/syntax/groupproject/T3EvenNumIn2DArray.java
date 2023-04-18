/*
  Create a 2D array or integer type where you will store odd and even numbers.
  Develop a program which will identify/print the even numbers only.
 */
package com.syntax.groupproject;

public class T3EvenNumIn2DArray {
    public static void main(String[] args) {
        int[][] integer = {
                {1, 20, 3, 55},
                {40, 5, 60, 21},
                {71, 88, 90, 7}
        };

        for (int[] ints : integer) {
            for (int intNum : ints) {
                if (intNum % 2 == 0) {
                    System.out.print(intNum + " ");
                }
            }
        }
    }
}
