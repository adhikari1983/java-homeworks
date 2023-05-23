/*
    Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".

 */
package com.syntax.groupproroject2;

public class T1ReverseString {

    //method 1
    public static String reverseString(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }

    //method 2
    public static String reverseString1(String str1){
        return new StringBuilder(str1).reverse().toString();
    }

    public static void main(String[] args) {
        String result = reverseString("Hello");
        System.out.println(result);

        String result1 = reverseString1("Hello");
        System.out.println(result1);
    }
}
