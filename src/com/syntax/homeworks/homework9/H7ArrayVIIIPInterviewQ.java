/*
  From an array of integer elements find the largest number.
 */
package com.syntax.homeworks.homework9;

public class H7ArrayVIIIPInterviewQ { //viiiiiiiip interview question

    public static void main(String[] args) {
        int[] integers = {3, 7, 2, 4, 5, 6, 9};

        int largestNumber = integers[0];
        for (int integer : integers) {
            if (integer > largestNumber) {
                largestNumber = integer;
            }
        }
        System.out.println("The largest number is : " + largestNumber);
    }
}
