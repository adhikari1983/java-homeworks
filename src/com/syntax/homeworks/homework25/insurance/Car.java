package com.syntax.homeworks.homework25.insurance;

public class Car extends Insurance{
    private String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Car insurance quote of " + carModel);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel car insurance of " + insuranceName);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
