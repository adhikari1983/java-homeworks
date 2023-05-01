/*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
 */
package com.syntax.homeworks.homework15;

public class Students {
    String name;
    String id;
    static int numberOfStudents = 0;


    public static void main(String[] args) {

        Students student1 = new Students();
        System.out.println(student1.name = "Kiran");
        System.out.println(student1.id = "2023BATCH16G-13R-111");
        int studentOfGroup13 = student1.numberOfStudents++;

        Students student2 = new Students();
        System.out.println(student2.name = "Ram");
        System.out.println(student2.id = "2023BATCH16G-14R-150");
        int studentOfGroup14 = student2.numberOfStudents++;

        Students student3 = new Students();
        System.out.println(student3.name = "Sita");
        System.out.println(student3.id = "2023BATCH16G-15R-071");
        int studentOfGroup15 = student3.numberOfStudents++;

        int totalNumberOfStudents = studentOfGroup13 + studentOfGroup14 + studentOfGroup15;
        System.out.println("Total Number Of Students = " + totalNumberOfStudents);


    }
}
