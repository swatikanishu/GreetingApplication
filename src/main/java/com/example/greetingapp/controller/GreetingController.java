package com.example.greetingapp.controller;
import com.example.greetingapp.model.User;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping("/greeting")
    public class GreetingController {

@Autowired
    GreetingService greetingService;

    @GetMapping(value = {"", "/", "/home"})
    public String greeting(@RequestParam(value = "name", defaultValue = "Swatika") String name) {
        return "HelloWorld " + name;
    }


    @GetMapping("/{name}")
    public String greetings(@PathVariable String name) {
        return "HelloWorld " + name;
    }

    @GetMapping("/service")
    public String greeting() {
        return GreetingService.greetingMessage();

    }

    @GetMapping("/user")
    public String greetMessageWithUser(@RequestParam(value = "firstName", defaultValue = "") String firstName,
                                       @RequestParam(value = "lastName", defaultValue = "") String lastName) {
        return GreetingService.greetMessageWithUser(firstName, lastName);
    }

    @PostMapping("/post")
    public User get(@RequestBody User greeting){
         greetingService.getGreeting(greeting);
        return greeting;
    }
    @GetMapping("/get/{id}")
    public Optional<User> sayHelloById (@PathVariable long id){
        Optional<User> response = greetingService.sayHelloById(id);
        return response;
    }
    @GetMapping("/allGreetings")
    public List<User> findAllGreetings() {
        return greetingService.findByAllGreet();
    }
    @PutMapping("/editGreet/{id}")
    public User editGreeting(@RequestBody User greeting, @PathVariable long id) {
        return greetingService.editGreeting(greeting, id);
    }
}



