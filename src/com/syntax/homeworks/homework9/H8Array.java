/*
   Create an array to store char values and then print those in reverse order.
 */
package com.syntax.homeworks.homework9;

public class H8Array {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = chars.length-1 ; i >= 0 ; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}
