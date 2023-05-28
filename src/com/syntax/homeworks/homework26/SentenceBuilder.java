/*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
 */
package com.syntax.homeworks.homework26;

import java.util.LinkedHashSet;

public class SentenceBuilder {
    public static void main(String[] args) {
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        stringLinkedHashSet.add("This");
        stringLinkedHashSet.add("is");
        stringLinkedHashSet.add("very");
        stringLinkedHashSet.add("tough");
        stringLinkedHashSet.add("problem.");

    StringBuilder newString = new StringBuilder();
        for (String s : stringLinkedHashSet) {
            newString.append(s+" ");
        }

        System.out.println(newString);
    }
}
