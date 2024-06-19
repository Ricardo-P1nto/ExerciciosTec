package com.example.app_Ricardo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello world";
    }
}

