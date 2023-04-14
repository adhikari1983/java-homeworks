/*
   Create an array of words: Java, Saturday, day, coding, is. Print the following sentence
   using elements of array: “Saturday is Java coding day”.
*/
package com.syntax.homeworks.homework9;

public class H3Array {
    public static void main(String[] args) {
        String[] words = {"Java", "Saturday", "day", "coding", "is"};

        String sentence = words[1]+ " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2];
        System.out.println(sentence);
    }
}
