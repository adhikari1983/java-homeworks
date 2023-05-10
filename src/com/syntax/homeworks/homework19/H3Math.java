/*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
 */
package com.syntax.homeworks.homework19;

public class H3Math {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a,double b) {
        System.out.println(a + b);
    }

    static void add(double a, int b) {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        add(1,2);
        add(10,10.5);
        add(10.5,10);
    }
}
