package com.syntax.groupproroject2.t7calculatemarks;

public class StudentA extends Marks{
    double marksOfMath;
    double marksOfPhysics;
    double marksOfBiology;

    public StudentA(double marksOfMath, double marksOfPhysics, double marksOfBiology) {
        this.marksOfMath = marksOfMath;
        this.marksOfPhysics = marksOfPhysics;
        this.marksOfBiology = marksOfBiology;
    }

    @Override
    public void getPercentage() {
        double avgMarks = (marksOfMath+marksOfPhysics+marksOfBiology)/3;
        System.out.println("Average marks of student A = " + avgMarks);
    }
}
