package com.sample.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-controller")
public class MyApp2Controller {

    @GetMapping("/helloWorld")
    public String zuulTest() {
        return "Hello World! Good Morning!";
    }
}
