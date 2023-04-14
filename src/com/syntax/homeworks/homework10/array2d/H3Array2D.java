/*
   Using 2D array create a grocery list. Inside you should have an array of veggies, fruits, dairy and sweets.
   Retrieve all values from that array using 2 different loops
 */
package com.syntax.homeworks.homework10.array2d;

public class H3Array2D {
    public static void main(String[] args) {
        String[][] grocery = {
                {"Potato", "Tomato", "Onion", "Pepper", "Garlic", "Ginger"},
                {"Apple", "Pears", "Orange", "Mango", "Grapes"},
                {"Milk", "Yogurt", "Cheese", "Butter"},
                {"Chocolate", "Candy", "Snickers", "Twix", "Kit Kat"}

        };

        for (int row = 0; row < grocery.length; row++) {
            for (int column = 0; column < grocery[row].length; column++) {
                System.out.print(grocery[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] groceryArray : grocery) {
            for (String groceryName : groceryArray) {
                System.out.print(groceryName + " ");
            }
            System.out.println();
        }
    }
}
