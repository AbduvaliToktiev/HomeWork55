package com.example.homework55.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnTextController {


    @GetMapping(value = "/hello-world")
    public String returnTextGet() {
        return "Hello World!";
    }

    @PostMapping(value = "/hello-text")
    public String returnTextPost(@RequestParam(name = "text", required = false) String text) {
        return "Hello " + text;
    }
}
