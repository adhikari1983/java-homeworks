/*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
package com.syntax.homeworks.homework21;

public class Computer {
    private String name;
    private double price;
    private String model;

    public Computer(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    void input(){
        System.out.println("Computer is taking input from keyboard.");
    }

    void process(){
        System.out.println("Computer is processing the input.");
    }

    void output(){
        System.out.println("Computer is displaying the output on monitor");
    }

    void printInfo() {
        System.out.println(name + " " + price + " " + model);
    }
}
