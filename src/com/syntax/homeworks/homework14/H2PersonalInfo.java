/*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */
package com.syntax.homeworks.homework14;

import java.util.Scanner;

public class H2PersonalInfo {

    String createEmail(String firstName, String lastName, String emailType) {
        String email = firstName + lastName + "@" + emailType + ".com";
        return email;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String userFirstName = scan.next().toLowerCase();
        System.out.println("Enter your last name : ");
        String userLastName = scan.next().toLowerCase();
        System.out.println("Enter email type for email address : ");
        String userEmailType = scan.next().toLowerCase();


        H2PersonalInfo obj = new H2PersonalInfo();
        String emailAddress = obj.createEmail(userFirstName, userLastName, userEmailType);
        System.out.println("User emailAddress will be  = " + emailAddress);

    }
}
