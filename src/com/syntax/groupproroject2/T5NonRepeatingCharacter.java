/*
    Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c
 */
package com.syntax.groupproroject2;

public class T5NonRepeatingCharacter {
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        char firstNonRepeatingCharacter = findFirstNonRepeatingCharacter(str);
        System.out.println("The first non-repeating character in the string "
                + str + " is : " + firstNonRepeatingCharacter);
    }
}
