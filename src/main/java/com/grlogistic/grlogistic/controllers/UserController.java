package com.grlogistic.grlogistic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @GetMapping("/name")
    public String getUserName() {
        return  "No Ramesh this is new deepak ji branch";
    }


}
