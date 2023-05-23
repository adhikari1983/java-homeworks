/*
    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.
 */
package com.syntax.groupproroject2;

import java.util.Arrays;

public class T4AnagramsCheck {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] s1CharArray = str1.toCharArray();
        Arrays.sort(s1CharArray);
        char[] s2CharArray = str2.toCharArray();
        Arrays.sort(s2CharArray);

        return Arrays.equals(s1CharArray, s2CharArray);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "slient";

        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams");
        }

    }
}
