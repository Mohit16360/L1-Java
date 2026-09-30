package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String Hello() {
        return "<h2>Mohit<h2>";
    }

    @PostMapping
    public ResponseEntity<String> createdStudent() {
        return null;
    }

}
