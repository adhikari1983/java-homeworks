/*
Write a program that creates an array of integers and stores the following values:
45, 78, 12,  67, 55 and then prints all array values.
 */
package com.syntax.replits.replit4.arrays;

public class E70Arrays {
    public static void main(String[] args) {
        int[] integers = new int[5];
        integers[0] = 45;
        integers[1] = 78;
        integers[2] = 12;
        integers[3] = 67;
        integers[4] = 55;

        for (int integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
