/*
   Create an array of animals and store 5 elements into it. Using 2 different loops
   print all elements from the array.
*/
package com.syntax.homeworks.homework9;

public class H5Array {
    public static void main(String[] args) {
        // first way
        String[] animalsName = {"Cat", "Mouse", "Dog", "Horse", "Donkey"};
        for (int i = 0; i < animalsName.length; i++) {
            System.out.print( animalsName[i] + " ");
        }
        System.out.println();

        // second way
        String[] animals = new String[5];
        animals[0] = "Cow";
        animals[1] = "Buffalo";
        animals[2] = "Bison";
        animals[3] = "Goat";
        animals[4] = "Sheep";
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
    }
}
