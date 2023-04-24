/*
    How would you check if String is palindrome or not?
        aba=> true       racecar
        Abbc =>false
 */
package com.syntax.homeworks.homework13;

import java.util.Scanner;

public class H2PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word for palindrome check:");
        String word = scan.nextLine();

        H2PalindromeString check = new H2PalindromeString();
        boolean checkPalindrome = check.isPalindrome(word);
        System.out.println(checkPalindrome);

    }

    boolean isPalindrome(String anyWord) {
        for (int i = 0; i < anyWord.length() / 2; i++) {
            if (anyWord.charAt(i) != anyWord.charAt(anyWord.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
