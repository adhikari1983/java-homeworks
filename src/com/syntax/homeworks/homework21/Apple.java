package com.syntax.homeworks.homework21;

public class Apple extends Computer {
    private boolean hasTouchScreen;

    public Apple(String name, double price, String model, boolean hasTouchScreen) {
        super(name, price, model);
        this.hasTouchScreen = hasTouchScreen;
    }

    @Override
    void input() {
        System.out.println("Apple's Computer is is taking input from keyboard.");
    }

    @Override
    void process() {
        System.out.println("Apple's Computer is processing the input.");
    }

    @Override
    void output() {
        System.out.println("Apple's Computer is displaying the output on monitor.");
    }

    void display(){
        System.out.println("Apple's Computer has Retina Display.");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Has touch screen ? " + hasTouchScreen);
    }
}
