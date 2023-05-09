/*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
 */
package com.syntax.homeworks.homework17;

public class H2AllModifiers {
    private String privateCnstr;
    public int publicCnstr;
    boolean defaultCnstr;
    protected double protectedCnstr;

    private H2AllModifiers(String s) {
        privateCnstr = s;
        System.out.println("Called from private constructor: " + privateCnstr);
    }

    public H2AllModifiers(int num) {
        publicCnstr = num;
        System.out.println("Called from public constructor : " + publicCnstr);
    }

    H2AllModifiers(boolean flag) {
        defaultCnstr = flag;
        System.out.println("Called from default constructor : " + defaultCnstr);
    }

    protected H2AllModifiers(double decimal) {
        this.protectedCnstr = decimal;
        System.out.println("Called from protected constructor : " + protectedCnstr);
    }

    public static void main(String[] args) {
        H2AllModifiers modifier1 = new H2AllModifiers("Hello");
        H2AllModifiers modifier2 = new H2AllModifiers(45);
        H2AllModifiers modifier3 = new H2AllModifiers(true);

    }

}
