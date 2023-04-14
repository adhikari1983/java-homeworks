
package com.syntax.homeworks.homework4;

import java.util.Scanner;

public class LoanProgram {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter the loan amount to submit the request. ");
        int loanRequest = scanInput.nextInt();

        if(loanRequest <= 200000){
            System.out.println("Lend the money to the client. ");
        }else{
            System.out.println("Reject the Loan. ");
        }
    }
}
