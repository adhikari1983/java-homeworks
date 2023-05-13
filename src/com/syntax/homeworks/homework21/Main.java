package com.syntax.homeworks.homework21;

public class Main {

    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Apple("Apple", 1000, "Airbook11", true);
        computers[1] = new Lenovo("Lenovo", 1200, "LenovoYoga", true);
        computers[2] = new HP("HP", 1300, "Pavilion", true);
        computers[3] = new Dell("Dell", 1400, "DellXPS", true);


        for (Computer computer : computers) {
            computer.printInfo();
            computer.input();
            computer.process();
            computer.output();

            if (computer instanceof Apple) {
                ((Apple) computer).display();
            } else if (computer instanceof HP) {
                ((HP) computer).sureView();
            } else if (computer instanceof Lenovo) {
                ((Lenovo) computer).flip();
            } else if (computer instanceof Dell) {
                ((Dell) computer).support();
            }
            System.out.println();
        }
    }
}
