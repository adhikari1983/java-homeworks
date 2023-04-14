/*
   Create an array of cars and store 6 elements into it. Using 2 different
   loops print all values from the array.
*/
package com.syntax.homeworks.homework9;

public class H4Array {
    public static void main(String[] args) {
        // first way
        String[] carsName = {"BMW", "Audi", "Honda", "Toyota", "Ford", "Mazda", "Nissan"};
        for (int i = 0; i < carsName.length; i++) {
            System.out.print( carsName[i] + " ");
        }
        System.out.println();

        // second way
        String[] cars = new String[6];
        cars[0] = "Suzuki";
        cars[1] = "Tesla";
        cars[2] = "Volkswagen";
        cars[3] = "Hyundai";
        cars[4] = "Kia";
        cars[5] = "Mercedes";
        for (String car : cars) {
            System.out.print(car + " ");
        }

    }
}
