/*
   Create an array on integers and calculate the sum of all the elements in an array.
 */
package com.syntax.homeworks.homework9;

public class H6Array {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum = integers[i] + sum;
        }
        System.out.println(sum);
    }
}
