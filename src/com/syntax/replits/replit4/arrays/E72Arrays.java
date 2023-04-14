/*
**For you to do:**
Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}

Print the values so the output should look like below
**Output:**
syntax
 */
package com.syntax.replits.replit4.arrays;

public class E72Arrays {
    public static void main(String[] args) {
        char[] chars = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        String word = chars[0] + "" + chars[2] + "" + chars[4] + "" + chars[6] + "" + chars[1] + "" + chars[10];
        System.out.println(word);
    }
}
