package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeApi {
    
    @GetMapping("welcome")
    public ResponseEntity<String> welcome(@RequestParam String name){
        return ResponseEntity.ok("Welcome " + name + "!");
    }
}
