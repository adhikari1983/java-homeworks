/*
Write a program that creates an array of integers and stores the following values:
45, 78, 12,  67, 55 and then prints all array values.
 */
package com.syntax.replits.replit4.arrays;

public class E71Arrays {
    public static void main(String[] args) {
        int[] integers = new int[9];
        integers[0] = 45;
        integers[1] = 78;
        integers[2] = 12;
        integers[3] = 67;
        integers[4] = 55;
        integers[5] = 89;
        integers[6] = 23;
        integers[7] = 77;
        integers[8] = 88;

        for (int i = 0; i < integers.length; i+=2) {
                System.out.print(integers[i] + " ");
        }
    }
}
