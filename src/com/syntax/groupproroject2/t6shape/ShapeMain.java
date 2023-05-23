package com.syntax.groupproroject2.t6shape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Square square = new Square(5.5);

        circle.calculateArea();
        circle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();
    }
}
