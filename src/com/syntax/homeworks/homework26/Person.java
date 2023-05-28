/*
    Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.

    In Test Class create a Map that will store key in ascending order. In that map store
    personId and a Person Object. Print each object details.
 */
package com.syntax.homeworks.homework26;

import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
class TestClass {
    public static void main(String[] args) {
        TreeMap<Integer, Person> personsDetails = new TreeMap<>();
        personsDetails.put(5, new Person("Jack", "Smith", 40, 88000));
        personsDetails.put(6, new Person("Kiran", "Adhikari", 36, 78000));
        personsDetails.put(7, new Person("Jhonny", "Rice", 37, 78000));
        personsDetails.put(8, new Person("Gill", "Mate", 38, 78000));
        personsDetails.put(9, new Person("John", "Doe", 39, 98000));

        //  using values
        for (var value : personsDetails.values()) {
            System.out.println(value.toString());
        }

        // using entrySet
        for (var entry : personsDetails.entrySet()) {
            System.out.println(entry.getValue());
        }


    }
}
