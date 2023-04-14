/*
   Create an array of names and store all names of your group. Then print your name from that array.
   (use 2 different ways of creating an array).
*/
package com.syntax.homeworks.homework9;

public class H2Array {
    public static void main(String[] args) {
        // first way
        String[] studentNames = {"Slobodan", "Svetlana", "Wael", "Semir", "Zarina", "Kiran"};
        System.out.print("My name is " + studentNames[5]);

        System.out.println();
        // second way
        String[] names = new String[5];
        names[0] = "Nataliya";
        names[1] = "Yelizaveta";
        names[2] = "Svetlana";
        names[3] = "Tiadorh ";
        names[4] = "Kiran";
        System.out.print("My name is " + names[4]);
    }
}
