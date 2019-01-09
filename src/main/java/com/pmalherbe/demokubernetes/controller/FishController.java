package com.pmalherbe.demokubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishController {

    @GetMapping("/")
    private String getAllFish(){
        return "This is version 1";
    }
}
