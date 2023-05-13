package com.syntax.homeworks.homework21;

public class Dell extends Computer {
    private boolean hasSpeakers;

    public Dell(String name, double price, String model, boolean hasSpeakers) {
        super(name, price, model);
        this.hasSpeakers = hasSpeakers;
    }

    @Override
    void input() {
        System.out.println("Dell's Computer is is taking input from keyboard.");
    }

    @Override
    void process() {
        System.out.println("Dell's Computer is processing the input.");
    }

    @Override
    void output() {
        System.out.println("Dell's Computer is displaying the output on monitor");
    }

    void support(){
        System.out.println("Dell's Computer has  24/7 technical assistance/repair services/certified technicians ");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Has speakers ? " + hasSpeakers);
    }
}
