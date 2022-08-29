package com.example.greetingapp.service;

import com.example.greetingapp.model.User;
import com.example.greetingapp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GreetingService {
    @Autowired
    public Repo repository;


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
        return "Hello! " + firstName + " " + lastName + ", Welcome to the GreetingApp!";
    }


    public User getGreeting(User greeting) {
        repository.save(greeting);
        return greeting;
    }
    public Optional<User> sayHelloById(long id) {
        return repository.findById(id);

    }
    public List<User> findByAllGreet(){
        return repository.findAll();
    }

}




























