/*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an
    employee who gets the highest salary. Output should be in the below format
    John Smith=$100000
 */
package com.syntax.homeworks.homework26;

import java.util.LinkedHashMap;

public class Employee {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> employees = new LinkedHashMap<>();

        employees.put("Flick Wright", 85000.0);
        employees.put("Marry Roe", 99000.0);
        employees.put("Jack Relish", 88000.0);
        employees.put("John Smith", 100000.0);
        employees.put("Harry Potter", 78000.0);

        String highestSalaryEmployee = "";
        double highestSalary = 0;

        for (var entry : employees.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestSalaryEmployee = entry.getKey();
            }
        }
        System.out.println(highestSalaryEmployee + "=" + highestSalary);
    }
}
