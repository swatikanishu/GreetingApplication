package com.example.greetingapp.controller;
import java.util.concurrent.atomic.AtomicLong;
import com.example.greetingapp.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/greeting")
    public class GreetingController {
        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();


        @GetMapping(value = { "", "/", "/home" })
        public Model greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            return new Model(counter.incrementAndGet(), String.format(template, name));
        }


        @GetMapping("/{name}")
        public Model greetings(@PathVariable String name) {
            return new Model(counter.incrementAndGet(), String.format(template, name));
        }

    }
