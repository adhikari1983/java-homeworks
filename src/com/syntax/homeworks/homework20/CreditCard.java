/*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
 */
package com.syntax.homeworks.homework20;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest() {
        double result = balance * interest * 12 / 100;
        System.out.println("Interest based on the given balance is : " + result);
    }
}

class Visa extends CreditCard {

    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double result = balance * interest * 18 / 100;
        System.out.println("Interest based on the given balance is : " + result);
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard(5000, 1.5);
        Visa visa = new Visa(5000, 2.5);
        AX ax = new AX(10000, 3.5);

        card.calculateInterest();
        visa.calculateInterest();
        ax.calculateInterest();
    }
}