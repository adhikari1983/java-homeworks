package com.syntax.groupproroject2.t6shape;

public class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of the Square is : " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the Circle : " + perimeter);
    }
}
