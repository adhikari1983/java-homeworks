package com.syntax.homeworks.homework25.student;

import java.util.HashSet;

public class StudentMain {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Kiran","111"));
        students.add(new Student("Vlad","123"));
        students.add(new Student("Jack","145"));
        students.add(new Student("Leo","99"));

        for (Student student : students) {
            String name = student.getName();
            System.out.println(name);
        }
    }
}
