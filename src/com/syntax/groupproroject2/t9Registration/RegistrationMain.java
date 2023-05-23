package com.syntax.groupproroject2.t9Registration;

public class RegistrationMain {
    public static void main(String[] args) {
        Registration registration = new Registration();

        registration.setEmail("xyz@gmail.com");
        System.out.println(registration.getEmail());
        registration.setEmail("abc@yahoo.com");
        System.out.println(registration.getEmail() + "\n");

        registration.setUserName("kiran");
        System.out.println(registration.getUserName());
        registration.setUserName("kiran123");
        System.out.println(registration.getUserName() + "\n");

        registration.setPassword("pass");
        System.out.println(registration.getPassword());
        registration.setPassword("123pass");
        System.out.println(registration.getPassword());
    }
}
