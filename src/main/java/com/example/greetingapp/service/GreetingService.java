package com.example.greetingapp.service;


import com.example.greetingapp.model.Model;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements GreetingServices.IGreetingService {

    private static final String template = "Hello world";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Model greetingMessage() {

        return new Model(counter.incrementAndGet(), String.format(template));
    }



}