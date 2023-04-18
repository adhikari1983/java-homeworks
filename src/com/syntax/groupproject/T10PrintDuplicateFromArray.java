/*
   Write a program to print out duplicate elements from an Array of Strings?
 */
package com.syntax.groupproject;

public class T10PrintDuplicateFromArray {
    public static void main(String[] args) {
        String[] cars = {"Honda", "Mazda", "Ford", "Toyota", "Tesla", "Honda"};

        boolean hasDuplicate = false;
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i] == cars[j]) {
                    System.out.println("Duplicate car's name : " + cars[i]);
                    hasDuplicate = true;
                }
            }
        }
        if (!hasDuplicate) {
            System.out.println("No duplicate found. ");
        }
    }
}
