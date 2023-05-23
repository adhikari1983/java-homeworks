package com.syntax.groupproroject2.t8car;

public class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight > 2000){
            return super.calculateSalePrice()*0.1;
        }else{
            return super.calculateSalePrice()*0.2;
        }
    }
}
