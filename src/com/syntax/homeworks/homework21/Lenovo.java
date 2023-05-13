package com.syntax.homeworks.homework21;

public class Lenovo extends Computer{
    private boolean hasExtraHDMIPorts;
    public Lenovo(String name, double price, String model,boolean hasExtraHDMIPorts) {
        super(name, price, model);
        this.hasExtraHDMIPorts = hasExtraHDMIPorts;
    }

    @Override
    void input() {
        System.out.println("Lenovo-Computer is is taking input from keyboard.");
    }

    @Override
    void process() {
        System.out.println("Lenovo-Computer is processing the input.");
    }

    @Override
    void output() {
        System.out.println("Lenovo-Computer is displaying the output on monitor");
    }

    void flip(){
        System.out.println("Lenovo's Computer has 360° flipping feature");
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Has extra HDMI ports ? " + hasExtraHDMIPorts);
    }
}
