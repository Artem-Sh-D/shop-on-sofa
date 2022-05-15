package com.shop.shoponsofa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String getHome() {
        return "Hello Volodimir";
    }

}
