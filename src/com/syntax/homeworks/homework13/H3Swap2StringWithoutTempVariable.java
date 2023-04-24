/*
    How would you swap  2 strings without a temporary variable?
 */
package com.syntax.homeworks.homework13;

public class H3Swap2StringWithoutTempVariable {
    public static void main(String[] args) {
        String firstWord = "First";
        String secondWord = "Second";

        System.out.println("Before swap");
        System.out.println("First word = " + firstWord + "\n" + "Second word = " + secondWord);

        firstWord = firstWord + secondWord;
        secondWord = firstWord.substring(0, firstWord.length() - secondWord.length());
        firstWord = firstWord.substring(secondWord.length());

        System.out.println("After swap");
        System.out.println("First word = " + firstWord + "\n" + "Second word = " + secondWord);

    }
}
