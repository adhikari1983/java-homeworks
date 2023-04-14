
package com.syntax.homeworks.homework4;

import java.util.Scanner;

public class MonthsByNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of the month");
        int numberOfMonth = scan.nextInt();

        if(numberOfMonth == 1){
            System.out.println("This is the month of January.");
        }else if(numberOfMonth == 2){
            System.out.println("This is the month of February. ");
        }else if(numberOfMonth == 3){
            System.out.println("This is the month of March. ");
        }else if(numberOfMonth == 4){
            System.out.println("This is the month of April. ");
        }else if(numberOfMonth == 5){
            System.out.println("This is the month of May. ");
        }else if(numberOfMonth == 6){
            System.out.println("This is the month of June. ");
        }else if(numberOfMonth == 7){
            System.out.println("This is the month of July. ");
        }else if(numberOfMonth == 8){
            System.out.println("This is the month of August. ");
        }else if(numberOfMonth == 9){
            System.out.println("This is the month of September. ");
        }else if(numberOfMonth == 10){
            System.out.println("This is the month of October. ");
        }else if(numberOfMonth == 11){
            System.out.println("This is the month of November");
        }else if(numberOfMonth == 12){
            System.out.println("This is the month of December. ");
        }else{
            System.out.println("Invalid input. ");
        }
    }
}
