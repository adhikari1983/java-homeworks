/*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
 */
package com.syntax.homeworks.homework16.reversestring;

public class H1ReverseString {

    public static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
