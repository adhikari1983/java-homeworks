/*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
 */
package com.syntax.homeworks.homework17;

public class H1Students {
    String name;
    double mathGrade;
    double scienceGrade;
    double englishGrade;

    public H1Students(String name, double mathGrade, double scienceGrade, double englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    void averageMark() {
        double mark = (mathGrade + scienceGrade + englishGrade) / 3.0;
        System.out.println("Average mark of " + name + " is : " + mark);
    }

    public static void main(String[] args) {
        H1Students student1 = new H1Students("Slobadan", 98, 88, 78);
        H1Students student2 = new H1Students("Vlad", 80, 75, 88);
        H1Students student3 = new H1Students("Semir", 70, 75, 80);
        H1Students student4 = new H1Students("Lovely", 85, 90, 95);
        H1Students student5 = new H1Students("Farwa", 75, 80, 85);

        student1.averageMark();
        student2.averageMark();
        student3.averageMark();
        student4.averageMark();
        student5.averageMark();
    }
}
