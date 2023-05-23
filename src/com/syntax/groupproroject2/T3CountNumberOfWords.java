/*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
 */
package com.syntax.groupproroject2;

public class T3CountNumberOfWords {

    public static int countWords(String str) {

        String[] editedString = str.split("[\\p{Punct}\\s]+");
        int count = 0;
        for (String word : editedString) {
            if (!str.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = countWords("Hello, world!");
        System.out.println(result);
    }
}
