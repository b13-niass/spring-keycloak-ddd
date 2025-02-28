package com.codev13.springkeycloakddd.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping("/dashboard")
    public String helloPrivate() {
        return "Hello Private";
    }
}
