/*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
    and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and
    Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
 */
package com.syntax.homeworks.homework25.insurance;

public abstract class Insurance {
    protected String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();

}
