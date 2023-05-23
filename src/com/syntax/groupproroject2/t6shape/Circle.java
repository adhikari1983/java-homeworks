package com.syntax.groupproroject2.t6shape;

public class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is : " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the Circle is : " + perimeter);
    }
}
