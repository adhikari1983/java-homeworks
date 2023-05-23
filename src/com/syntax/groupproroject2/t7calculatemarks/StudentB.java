package com.syntax.groupproroject2.t7calculatemarks;

public class StudentB extends Marks {
    double marksOfMath;
    double marksOfPhysics;
    double marksOfBiology;
    double marksOfChemistry;

    public StudentB(double marksOfMath, double marksOfPhysics, double marksOfBiology, double marksOfChemistry) {
        this.marksOfMath = marksOfMath;
        this.marksOfPhysics = marksOfPhysics;
        this.marksOfBiology = marksOfBiology;
        this.marksOfChemistry = marksOfChemistry;
    }

    @Override
    public void getPercentage() {
        double avgMarks = (marksOfMath + marksOfPhysics + marksOfBiology + marksOfChemistry) / 4;
        System.out.println("Average marks of student B = " + avgMarks);
    }
}
