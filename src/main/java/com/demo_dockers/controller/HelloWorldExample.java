package com.demo_dockers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldExample {

    @RequestMapping(value = "/message")
    public String getMessage(){
        return "Hello World from psa";
    }
}
