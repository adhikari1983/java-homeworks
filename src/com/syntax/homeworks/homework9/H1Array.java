/*
create an array of chars and store grades into it: A,B,C,D.
Then print a grade B(use 2 different ways of creating an array).
 */
package com.syntax.homeworks.homework9;

public class H1Array {
    public static void main(String[] args) {
        // first way
        char[] characters = {'A', 'B', 'C', 'D'};
        System.out.print(characters[1] + " ");

        //second way
        char[] chars = new char[4];
        chars[0] = 'A';
        chars[1] = 'B';
        chars[2] = 'C';
        chars[3] = 'D';
        System.out.println(chars[1]);
    }
}
