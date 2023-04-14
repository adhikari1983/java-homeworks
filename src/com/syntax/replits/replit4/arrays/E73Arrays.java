/*
**For you to do:**
Write a program that creates an array of strings with the following values
{"This", "is", "array", "of", "strings"} and prints all values in one line.
**Output:**
This is array of strings
 */
package com.syntax.replits.replit4.arrays;

public class E73Arrays {
    public static void main(String[] args) {
        String[] words = {"This", "is", "array", "of", "strings"};
        String sentence = words[0] + " " + words[1] + " " + words[2] + " " + words[3] + " " + words[4];
        System.out.println(sentence);
    }
}
