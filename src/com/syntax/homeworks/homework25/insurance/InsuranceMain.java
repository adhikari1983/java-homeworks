package com.syntax.homeworks.homework25.insurance;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceMain {
    public static void main(String[] args) {

        ArrayList<Insurance> infoList = new ArrayList<>();
        infoList.add(new Car("Liberty", "Accord"));
        infoList.add(new Pet("Dog", "Unknown"));
        infoList.add(new Health("Blue cross"));

        // Using for loop
        for (int i = 0; i < infoList.size(); i++) {
            System.out.println(infoList.get(i).toString());
            infoList.get(i).getQuote();
            infoList.get(i).cancelInsurance();
        }

        // Using advanced for loop
        for (Insurance element : infoList) {
            System.out.println(element.toString());
            element.getQuote();
            element.cancelInsurance();
        }

        // Using iterator
        Iterator<Insurance> infoIterator = infoList.iterator();
        while (infoIterator.hasNext()) {
            Insurance element1 = infoIterator.next();
            System.out.println(element1.toString());
            element1.getQuote();
            element1.cancelInsurance();
        }


    }
}
