package com.syntax.homeworks.homework25.insurance;

public class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Health insurance quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel health insurance");
    }

    @Override
    public String toString() {
        return "Health{"+ "insuranceName='" + insuranceName + '\'' + '}';
    }
}
