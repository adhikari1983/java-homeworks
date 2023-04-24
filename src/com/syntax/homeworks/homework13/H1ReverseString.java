/*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
package com.syntax.homeworks.homework13;

public class H1ReverseString {
    public static void main(String[] args) {
        String sentence = "This is sentence i want to reverse";

        String[] splitArray = sentence.split(" ");

        for (String arrayWord : splitArray) {
            StringBuilder stb = new StringBuilder(arrayWord);
            System.out.print(stb.reverse().append(" "));
        }
    }
}
