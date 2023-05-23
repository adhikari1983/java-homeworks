package com.syntax.groupproroject2.t7calculatemarks;

public class MarksMain {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(85,90,75);
        studentA.getPercentage();

        StudentB studentB = new StudentB(80,93,85,87);
        studentB.getPercentage();
    }
}
