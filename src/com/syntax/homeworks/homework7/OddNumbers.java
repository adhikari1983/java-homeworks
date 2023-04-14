//Print odd numbers between 20 and 50 (2 ways)
package com.syntax.homeworks.homework7;

public class OddNumbers {
    public static void main(String[] args) {
        //using while loop
        int counter = 20;

        while (counter <= 50) {
            if (counter % 2 != 0){
                System.out.print(counter + " ");}
                counter++;
        }

        System.out.println();
        //using for loop
        for (int i = 20; i <= 50; i++) {
            if(i % 2 !=0){
                System.out.print(i + " ");
            }
        }
    }
}
