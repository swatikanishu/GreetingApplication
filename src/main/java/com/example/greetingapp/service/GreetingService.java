package com.example.greetingapp.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingService{
    public static String greetingMessage() {
        return "Hello World";
    }

    public static String greetMessageWithUser(String firstName, String lastName) {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return greetingMessage();
        } else if (lastName.equals("") && !firstName.equals("")) {
            return "Hello! " + firstName + ", Welcome to the  Lucknow!";
        } else if (!lastName.equals("") && firstName.equals("")) {
            return "Hello! " + lastName + ", Welcome to the BridgeLabz!";
        }
        return "Hello! " + firstName +" "+ lastName + ", Welcome to the GreetingApp!";
    }
}