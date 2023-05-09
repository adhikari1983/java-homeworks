/*
    Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
    Test all 4 classes
 */
package com.syntax.homeworks.homework18;

public class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am a " + subject +
                " teacher with " + experience + " experience");
    }

    void takeAttendance() {
        System.out.println("Taking attendance.");
    }

    void teach() {
        System.out.println("Teaching the class.");
    }

    void grade() {
        System.out.println("Grading the papers.");
    }

    static class MathTeacher extends Teacher {
        public MathTeacher(String name, String subject, int experience) {
            super(name, subject, experience);
        }
    }

    static class ChemistryTeacher extends Teacher {

        public ChemistryTeacher(String name, String subject, int experience) {
            super(name, subject, experience);
        }
    }

    static class PianoTeacher extends Teacher {

        public PianoTeacher(String name, String subject, int experience) {
            super(name, subject, experience);
        }
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mark", "All Subject", 25);
        teacher.introduce();
        teacher.takeAttendance();
        teacher.teach();
        teacher.grade();

        MathTeacher math = new MathTeacher("kiran", "Math", 10);
        math.introduce();
        math.takeAttendance();
        math.teach();
        math.grade();

        ChemistryTeacher chemistry = new ChemistryTeacher("Jack", "Chemistry", 5);
        chemistry.introduce();
        chemistry.takeAttendance();
        chemistry.teach();
        chemistry.grade();

        PianoTeacher piano = new PianoTeacher("Molly", "Piano", 10);
        piano.introduce();
        piano.takeAttendance();
        piano.teach();
        piano.grade();
    }
}
