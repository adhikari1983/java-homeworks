/*
    Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.
 */
package com.syntax.homeworks.homework28;

import java.util.Scanner;

public class HW2 {
    static void checkUserName(String str){
        if (str.length() < 5) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String checkUserName = scanner.next();

        try {
            checkUserName(checkUserName);
        }catch(RuntimeException e){
            System.out.println("Exception occurred "+ checkUserName + " must be more than 5 characters");
        }
    }
}
