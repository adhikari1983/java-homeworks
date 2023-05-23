package com.syntax.groupproroject2.t8car;

public class Sedan extends Car {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.05;
        } else {
            return super.calculateSalePrice() * 0.1;
        }
    }
}
