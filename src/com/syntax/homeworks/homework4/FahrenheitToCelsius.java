
package com.syntax.homeworks.homework4;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the name of the city. ");
        String cityName = userInput.nextLine();
        System.out.println("Enter the current temperature in Fahrenheit. ");
        int tempInFahrenheit = userInput.nextInt();

        int tempInCelsius = ((tempInFahrenheit - 32) * 5/9);
        System.out.println("The temperature of the city of " + cityName + " is " + tempInCelsius + "ºC");


    }
}
