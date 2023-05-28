package com.syntax.homeworks.homework25.insurance;

public class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Pet insurance quote of " + petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel pet insurance of " + insuranceName);
    }

    @Override
    public String toString() {
        return "Pet{" +
                " petType='" + petType + '\'' +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
