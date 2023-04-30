/*
    Create a method that will say Hello in different language based on the country
    that will be passed when method is executed.
 */
package com.syntax.homeworks.homework14;

import java.util.Scanner;

public class H1HelloInDiffLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the language name to say hello \n(options: Nepali, Chinese, French, Italian): ");
        String input = scan.next().toLowerCase();

        H1HelloInDiffLanguage obj = new H1HelloInDiffLanguage();
        obj.sayHello(input);

    }

    void sayHello(String language) {
        switch (language) {
            case "nepali":
                System.out.println("Namsate!!!");
                break;
            case "chinese":
                System.out.println("nǐ hǎo!!!");
                break;
            case "french":
                System.out.println("Bonjour!!!");
                break;
            case "italy":
                System.out.println("Ciao!!!");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
