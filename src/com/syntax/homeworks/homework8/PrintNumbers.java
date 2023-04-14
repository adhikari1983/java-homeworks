/*
  Print numbers from 1 to 50 except those that are divisible by 3.
 */
package com.syntax.homeworks.homework8;

public class PrintNumbers {
    public static void main(String[] args) {
        int number = 1;
        while(number <= 50){
            if(number%3 != 0) {
                System.out.print(number + " ");
            }
           number++;
        }
    }
}
