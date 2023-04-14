//Print numbers from 100 to 1
package com.syntax.homeworks.homework7;

public class PrintNumbers {
    public static void main(String[] args) {
        //using while loop
        int counter = 100;
        while(counter > 0){
            System.out.print(counter + " ");
            counter--;
        }

        System.out.println();
        //using for loop
        for (int j = 100; j > 0 ; j--) {
            System.out.print(j + " ");
        }
    }
}
