/* Create Java program to store 2 values for expected and actual hours. Your program should check
if expected hours are more than  actual the program should print “You will love the course, and you will succeed”,
otherwise “Course will be very hard for you!”*/
package com.syntax.homeworks.homework2;

public class HoursOfCommitment {
    public static void main(String[] args) {
        int expectedHours = 45;
        int actualHours = 40;
        if(expectedHours > actualHours){
            System.out.println("You will love the course, and you will succeed");
        }
        else{
            System.out.println("Course will be very hard for you!");
        }
    }
}
