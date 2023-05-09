package com.syntax.homeworks.homework016;

import com.syntax.homeworks.homework17.H2AllModifiers;

public class H2AllModifier extends H2AllModifiers {
    protected H2AllModifier(double decimal) {
        super(decimal);
    }

    public static void main(String[] args) {
        H2AllModifier modifier = new H2AllModifier(1.05);
    }
}
