//Print even numbers from 20 to 1 (2 ways)
package com.syntax.homeworks.homework7;

public class EvenNumbers {
    public static void main(String[] args) {
        //using while loop
        int counter = 20;
        while (counter >= 1) {
            if (counter % 2 == 0) {
                System.out.print(counter + " ");
            }
            counter--;
        }

        System.out.println();
        //using for loop
        for (int i = 20; i >= 1; i -= 2) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
