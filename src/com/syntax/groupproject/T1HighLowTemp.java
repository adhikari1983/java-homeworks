/*
   Create a program that uses an array to store a list of temperatures for a week,
   and then uses a loop to find the highest and lowest temperature for the week.
 */
package com.syntax.groupproject;

public class T1HighLowTemp {
    public static void main(String[] args) {
        int[] tempOfWeek = {34, 30, 55, 27, 25, 2, 31, 24, 32};

        int highestTemp = tempOfWeek[0];
        int lowestTemp = tempOfWeek[0];
        for (int temp : tempOfWeek) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
            else if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }
        System.out.println("Highest temperature for the week is " + highestTemp);
        System.out.println("Lowest temperature for the week is " + lowestTemp);
    }
}
