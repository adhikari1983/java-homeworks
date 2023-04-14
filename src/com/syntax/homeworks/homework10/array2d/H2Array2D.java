/*
   Create 2D array of cars : american, german, korean, italian.
   Then retrieve all values from that array using 2 different loops
 */
package com.syntax.homeworks.homework10.array2d;

public class H2Array2D {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Mustang", "Chevy", "Dodge", "Tesla"},
                {"BMW", "Mercedes", "Audi", "Volkswagen"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Fiat", "Alfa Romeo", "Maserati"}
        };

        for (int row = 0; row < cars.length; row++) {
            for (int column = 0; column < cars[row].length; column++) {
                System.out.print(cars[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] carArray : cars) {
            for (String carName : carArray) {
                System.out.print(carName + " ");
            }
            System.out.println();
        }
    }
}
