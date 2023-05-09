/*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling its name.
 */
package com.syntax.homeworks.homework16.vowelstring;

public class H2VowelsString {

    static String takeOutVowels(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(takeOutVowels("eagle flying high"));
    }
}
