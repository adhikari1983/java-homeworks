package com.syntax.replits.replit2.loops;

import java.util.Scanner;

public class E40ReplitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String name = scanner.next();

        String responsibility = "";
        switch (name) {
            case "Asghar":
                responsibility = "Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Weqas":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
                break;
        }
        System.out.println(responsibility);
    }
}
