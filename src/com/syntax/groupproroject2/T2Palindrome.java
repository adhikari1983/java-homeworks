/*
    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and backward.
    For example, "madam" is a palindrome.

 */
package com.syntax.groupproroject2;

public class T2Palindrome {

    //method 1
    public static boolean isPalindrome1(String str) {
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                check = false;
                break;
            }
        }
        return check;
    }

    //method 2
    public static boolean isPalindrome2(String str1) {
        String newStr1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            newStr1 += str1.charAt(i);
        }
        boolean check = false;
        if (newStr1.equalsIgnoreCase(str1)) {
            check = true;
        }
        return check;
    }

    //method 3
    public static boolean isPalindrome3(String str3){
        return new StringBuilder(str3).reverse().toString().equalsIgnoreCase(str3);
    }

    public static void main(String[] args) {
        String word = "madam";
        if(isPalindrome1(word)){
            System.out.println(word + " is a palindrome.");
        }else{
            System.out.println(word + " is not a palindrome.");
        }

        boolean result1 = isPalindrome2("madam");
        System.out.println(result1);

        boolean result3 = isPalindrome3("madam");
        System.out.println(result3);


    }
}
