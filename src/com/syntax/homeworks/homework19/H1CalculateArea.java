/*
Create 1 class in which create a methods that will calculate the area. The of Method name must be called calculateArea
Rectangle
Square
Use separate class to test your code
 */
package com.syntax.homeworks.homework19;

public class H1CalculateArea {

    static void calculateArea(double length, double width) {
        double rectangleArea = length * width;
        System.out.println("Area of the rectangle is : " + rectangleArea);
    }

    static void calculateArea(float length, float width) {
        float squareArea = length * width;
        System.out.println("Area of the rectangle is : " + squareArea);
    }

    public static void main(String[] args) {
        calculateArea(10, 10);
        calculateArea(5.0f, 5.0f);
    }
}
