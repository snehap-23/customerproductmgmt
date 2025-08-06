package com.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {


    @GetMapping("/Productfallback")
    public ResponseEntity<String> productFallBack() {
        return ResponseEntity.ok("Product Service is down please wait!!!!");
    }

    @GetMapping("/Customerfallback")
    public ResponseEntity<String> customerFallBack() {
        return ResponseEntity.ok("Customer Service is down please wait!!!!!");
    }
}
