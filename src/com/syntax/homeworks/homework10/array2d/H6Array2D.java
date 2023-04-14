/*
  Create 2D array of countries:
  north america countries, south america countries, europe countries, asian countries, african countries.
  Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
package com.syntax.homeworks.homework10.array2d;

public class H6Array2D {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Mexico", "Cuba", "Canada", "Panama", "Haiti", "Honduras", "Bahamas", "Dominica", "Barbados"},
                {"Argentina", "Brazil", "Chile", "Peru", "Ecuador", "Bolivia", "Uruguay", "Columbia", "Guyana", "Venezuela"},
                {"Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Iceland", "Ireland", "Italy"},
                {"Nepal", "China", "Cyprus", "Bhutan", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan"},
                {"Algeria", "Egypt", "Ethiopia", "Ghana", "Kenya", "Morocco", "Nigeria", "South Africa", "Tanzania", "Uganda"}

        };
        int counter = 0;

        for (int row = 0; row < countries.length; row++) {
            for (int column = 0; column < countries[row].length; column++) {
                System.out.print(countries[row][column] + " ");
                counter++;
            }
            System.out.println();
        }

        System.out.println("\nTotal countries number is :  " + counter + "\n");

        for (String[] countriesArray : countries) {
            for (String countryName : countriesArray) {
                System.out.print(countryName + " ");
            }
            System.out.println();
        }
    }
}
