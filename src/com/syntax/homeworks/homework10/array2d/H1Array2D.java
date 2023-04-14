/*
   Create a 2D array(shorter way) in which first array consists of 4 names and second array will contain grades.
   Then your program should print name of the students that has A and B grade.
 */
package com.syntax.homeworks.homework10.array2d;

public class H1Array2D {
    public static void main(String[] args) {
        String[][] studentInfo = {
                {"Kiran", "Slobodan", "Svetlana", "Wael"},
                {"C", "A", "D", "B"}
        };

        for (int i = 0; i < studentInfo[0].length; i++) {
            String name = studentInfo[0][i];
            String grade = studentInfo[1][i];
            if(grade.equals("A") || grade.equals("B")){
                System.out.print(name + " ");
            }

        }
    }
}
