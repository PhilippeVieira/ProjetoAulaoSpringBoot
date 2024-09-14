package org.example.projetoaulaospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.projetoaulaospringboot.service.*;

@RestController
public class Controller {
    @Autowired
    private AuthService authService;
    @GetMapping("/test")
    public String helloWorld() {
        return "Essa é minha primeira API REST";
    }

}

