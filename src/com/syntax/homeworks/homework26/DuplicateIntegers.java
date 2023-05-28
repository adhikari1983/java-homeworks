/*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
 */
package com.syntax.homeworks.homework26;

import java.util.ArrayList;
import java.util.List;

public class DuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
