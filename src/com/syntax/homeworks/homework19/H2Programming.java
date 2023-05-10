/*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed. If some String is passed to it, then
    in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed.
 */
package com.syntax.homeworks.homework19;

public class H2Programming {
    String language;

    H2Programming() {
        this.language = "programming languages";
    }

    public H2Programming(String language) {
        this.language = language;
    }

    void print() {
        System.out.println("I love " + this.language);
    }

    public static void main(String[] args) {
        H2Programming object1 = new H2Programming();
        object1.print();

        H2Programming object2 = new H2Programming("Java");
        object2.print();
    }


}
