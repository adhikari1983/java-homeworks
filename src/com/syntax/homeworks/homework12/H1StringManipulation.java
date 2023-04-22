/*
   Create a String and if the String is not empty perform the following:
   if the String has an odd number of characters and has 3 or more characters,
   print the character in the middle of the String.
   For Example:  String str=hello =>l
 */
package com.syntax.homeworks.homework12;

public class H1StringManipulation {
    public static void main(String[] args) {
        String str = "hello";

        if (!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length() >= 3) {
                int middleIndexOfStr = str.length() / 2;
                System.out.println("The character in the middle of the String is: "
                        + str.charAt(middleIndexOfStr));
            }
        }
    }
}
