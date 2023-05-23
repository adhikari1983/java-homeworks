package com.syntax.groupproroject2.t8car;

public class Car {
    protected double carPrice;
    protected String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
        return carPrice;
    }
}
