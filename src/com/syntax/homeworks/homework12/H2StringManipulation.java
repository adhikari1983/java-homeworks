/*
   Create a String and print it in reverse order (Sunday → yadnuS).
 */
package com.syntax.homeworks.homework12;

public class H2StringManipulation {
    public static void main(String[] args) {
        String string = "Sunday";
        String[] stringArray = new String[string.length()];

        for (int i = 0; i < string.length(); i++) {
            stringArray[i] = String.valueOf(string.charAt(i));
        }

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
        }

        // or simply
        for (int i = string.length()-1; i >=0 ; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
