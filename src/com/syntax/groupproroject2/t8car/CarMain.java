package com.syntax.groupproroject2.t8car;

public class CarMain {
    public static void main(String[] args) {
        Truck truck1 = new Truck(42000, "black", 2200);
        System.out.println("Truck price over 2000lbs weight is : " + truck1.calculateSalePrice());
        Truck truck2 = new Truck(42000, "brown", 1900);
        System.out.println("Truck price under 2000lbs weight is : " + truck2.calculateSalePrice());

        Sedan sedan1 = new Sedan(32000, "red", 25);
        System.out.println("Sedan price over 20 feet is : " + sedan1.calculateSalePrice());
        Sedan sedan2 = new Sedan(32000, "red", 18);
        System.out.println("Sedan price under 20 feet is : " + sedan2.calculateSalePrice());


    }
}
