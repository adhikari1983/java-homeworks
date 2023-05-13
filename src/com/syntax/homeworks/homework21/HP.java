package com.syntax.homeworks.homework21;

public class HP extends Computer {
    private boolean isGamingLaptop;

    public HP(String name, double price, String model, boolean isGamingLaptop) {
        super(name, price, model);
        this.isGamingLaptop = isGamingLaptop;
    }

    @Override
    void input() {
        System.out.println("HP-Computer is is taking input from keyboard.");
    }

    @Override
    void process() {
        System.out.println("HP-Computer is processing the input.");
    }

    @Override
    void output() {
        System.out.println("HP-Computer is displaying the output on monitor");
    }

    void sureView(){
        System.out.println("HP's computer provides privacy screen feature.");
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Is gaming computer ? " + isGamingLaptop);
    }
}
