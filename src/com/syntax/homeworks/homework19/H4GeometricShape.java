/*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
 */
package com.syntax.homeworks.homework19;

public class H4GeometricShape {

    private static void area(double a, double b) {
        double areaOfSquare = a * b;
        System.out.println("Area of the Square is : " + areaOfSquare);
    }

    private static void area(double a) {
        double areaOfCircle = Math.PI * a * a;
        System.out.println("Area of the Circle is : " + areaOfCircle);
    }

    private static void area(float a, float b) {
        double areaOfTriangle = 0.5 * a * b;
        System.out.println("Area of the Triangle is : " + areaOfTriangle);
    }

    public static void main(String[] args) {
        area(5.5, 5.5);
        area(5.5);
        area(5.5f, 5.5f);
    }
}
